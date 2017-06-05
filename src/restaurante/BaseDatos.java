package restaurante;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDatos {

    private String ruta;
    private Connection conex;

    public BaseDatos(String ruta) throws SQLException {
        this.ruta = ruta;
        this.conex = DriverManager.getConnection(ruta);
    }

    public BaseDatos() {

    }

    public void crearTabla() {
        Statement stmt = null;
        try {
            stmt = conex.createStatement();
        } catch (SQLException ex) {
        }
        try {
            stmt.executeQuery("CREATE TABLE PEDIDOS "
                    + "(NPedido integer PRIMARY KEY, "
                    + "NMesa integer, "
                    + "Precio integer)");
        } catch (SQLException ex) {
            System.out.println("Tabla PEDIDOS ya creada");
        }

        try {
            stmt.executeQuery("CREATE TABLE PP (NPedido integer, NombrePlato String, Cantidad integer)");
        } catch (SQLException ex) {
            System.out.println("Tabla PP ya creada");
        }
        try {
            stmt.executeQuery("CREATE TABLE SP (NPedido integer, NombrePlato String, Cantidad integer)");
        } catch (SQLException ex) {
            System.out.println("Tabla SP ya creada");
        }
        try {
            stmt.executeQuery("CREATE TABLE POSTRE (NPedido integer, NombrePlato String, Cantidad integer)");
        } catch (SQLException ex) {
            System.out.println("Tabla POSTRE ya creada");
        }
        try {
            stmt.executeQuery("CREATE TABLE BEBIDA (NPedido integer, NombrePlato String, Cantidad integer)");
        } catch (SQLException ex) {
            System.out.println("Tabla BEBIDA ya creada");
        }
    }

    public void insertarPlatos(String Tabla, int NPedido, String NombrePlato, int Cantidad) throws SQLException {

        String Qry = "";

        if ("PP".equals(Tabla)) {
            Qry = "INSERT INTO PP (NPedido, NombrePlato, Cantidad) VALUES (?,?,?)";
        } else if ("SP".equals(Tabla)) {
            Qry = "INSERT INTO SP (NPedido, NombrePlato, Cantidad) VALUES (?,?,?)";
        } else if ("BEBIDA".equals(Tabla)) {
            Qry = "INSERT INTO BEBIDA (NPedido, NombrePlato, Cantidad) VALUES (?,?,?)";
        } else {
            Qry = "INSERT INTO POSTRE (NPedido, NombrePlato, Cantidad) VALUES (?,?,?)";
        }

        PreparedStatement rs = conex.prepareStatement(Qry);
        rs.setInt(1, NPedido);
        rs.setString(2, NombrePlato);
        rs.setInt(3, Cantidad);
        rs.execute();
    }

    public void insertarPedidos(int NPedido, int NMesa, float Precio) throws SQLException {
        String Qry = "INSERT INTO PEDIDOS (NPedido, NMesa, Precio) VALUES (?,?,?)";
        PreparedStatement rs = conex.prepareStatement(Qry);
        rs.setInt(1, NPedido);
        rs.setInt(2, NMesa);
        rs.setFloat(3, Precio);
        rs.execute();
    }

    public ResultSet selectPedido() throws SQLException {
        Statement stmt = conex.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT NPedido, NMesa, Precio FROM PEDIDOS");
        return rs;
    }

    public ResultSet selectPlatos(int tabla, int numP) throws SQLException {
        Statement stmt = conex.createStatement();
        ResultSet rs = null;
        switch (tabla) {
            case 1:
                rs = stmt.executeQuery("SELECT NPedido, Cantidad FROM PP WHERE NPedido = " + numP);
                break;
            case 2:
                rs = stmt.executeQuery("SELECT NPedido, Cantidad FROM SP WHERE NPedido = " + numP);
                break;
            case 3:
                rs = stmt.executeQuery("SELECT NPedido, Cantidad FROM BEBIDA WHERE NPedido = " + numP);
                break;
            case 4:
                rs = stmt.executeQuery("SELECT NPedido, Cantidad FROM POSTRE WHERE NPedido = " + numP);
                break;
        }
        return rs;
    }

    public int selectMAX() throws SQLException {
        Statement stmt = conex.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT MAX(NPedido) Numero FROM PEDIDOS");

        int posicion = 0;
        while (rs.next()) {
            posicion = rs.getInt("Numero") + 1;
        }
        return posicion;
    }

}
