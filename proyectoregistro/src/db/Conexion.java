package db;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
  private final String driver;
  private final String cadenaConex;
  private Connection conex;


  public Conexion() {
    driver = "org.sqlite.JDBC";
    cadenaConex = "jdbc:sqlite:db/db_proyectoregistro.db";
    conex = null;

    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      JOptionPane.showMessageDialog(null, "Error en el driver.\n" + e.getMessage());
      System.exit(0);
    }
  }

  public boolean hayConexion() {
    try {
      return null != conex && !conex.isClosed();
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null,
          "Error al determinar si hay conexion.\n" + e.getMessage());
      return false;
    }
  }

  public void conectar() {
    if (!hayConexion()) {
      try {
        conex = DriverManager.getConnection(cadenaConex);
        JOptionPane.showMessageDialog(null, "Se ha conectado a la base de datos correctamente.");

      } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base datos.\n"
            + e.getMessage());
      }
    }
  }

  public void desconectar() {
    if (hayConexion()) {
      try {
        conex.close();
        conex = null;
        System.gc();
        JOptionPane.showMessageDialog(null, "Se ha desconectado de la base datos.");
      } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al desconectar de la base de datos.\n"
            + e.getMessage());
      }
    }
  }

// METODOS GET
  public String getCadenaConex() {
    return cadenaConex;
  }

  public Connection getConex() {
    return conex;
  }
}
