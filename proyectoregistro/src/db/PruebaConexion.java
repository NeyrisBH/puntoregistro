package db;

public class PruebaConexion {

  public static void main(String[] args) {
    Conexion c = new Conexion();

    c.conectar();
    c.desconectar();
  }
}
