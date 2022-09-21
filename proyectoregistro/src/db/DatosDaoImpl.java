package db;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatosDaoImpl implements DatosDAO {

    private Conexion conex;
    private List<DatosUsuario> lstRegistro;

    //CONSTRUCTOR
    public DatosDaoImpl() {
        conex = new Conexion();
        lstRegistro = new ArrayList<>();
    }

    
    //METODOS GET AND SETTER
    public Conexion getConex() {
        return conex;
    }

    public void setConex(Conexion conex) {
        this.conex = conex;
    }

    public List<DatosUsuario> getLstRegistro() {
        return lstRegistro;
    }

    public void setLstRegistro(List<DatosUsuario> lstRegistro) {
        this.lstRegistro = lstRegistro;
    }
    
    //BASE DE DATOS CON TABLA USUARIOS
    @Override
    public List<DatosUsuario> getAllDatosUsuarios() {
        Statement st;
        ResultSet rs;
        List<DatosUsuario> lst = new ArrayList<>();
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "select * from db_usuario";
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                DatosUsuario d = new DatosUsuario();
                
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setEmail(rs.getString("email"));
                d.setUsuario(rs.getString("usuario"));
                d.setContraseña(rs.getString("contraseña"));
                
                lst.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar todos los datos\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return lst; 
    }

    @Override
    public DatosUsuario getDatosUsuarios(String usuario) {
        Statement st;
        ResultSet rs;
        DatosUsuario d = new DatosUsuario();
        String sql = "";
        
        conex.conectar();
        
        try {
            sql = "select * from db_usuario where usuario = '" + usuario + "'";
            st = conex.getConex().createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                d.setNombres(rs.getString("nombres"));
                d.setApellidos(rs.getString("apellidos"));
                d.setEmail(rs.getString("email"));
                d.setUsuario(rs.getString("usuario"));
                d.setContraseña(rs.getString("contraseña"));
            }
        } catch (Exception e) {
            System.out.println("Error al consultar los datos por el Usuario\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return d;
    }

    @Override
    public void updateDatosUsuarios(DatosUsuario d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "UPDATE db_usuario SET "
                    + "nombres=" + "'" + d.getNombres()+ "'" + ", "
                    + "apellidos=" + "'" + d.getApellidos() + "'" + ", "
                    + "email=" + "'" + d.getEmail() + "'" + ", "
                    + "usuario=" + "'" + d.getUsuario() + "'" + ", "
                    + "contraseña=" + "'" + d.getContraseña() + "'"
                    + " WHERE usuario=" + d.getUsuario();
            
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al modificar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }

    @Override
    public void deleteDatosUsuarios(String usuario) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "delete from db_usuario where usuario = " + usuario;
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al borrar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }

    @Override
    public void insertarDatosUsuarios(DatosUsuario d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "insert into db_usuario (nombres,apellidos,email,usuario,contraseña) values ('"
                    + d.getNombres()+ "','"
                    + d.getApellidos() + "','"
                    + d.getEmail() + "','"
                    + d.getUsuario() + "','"
                    + d.getContraseña() + "')";
            
            st.execute(sql);

            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente en la base de datos");
        } catch (Exception e) {
            System.out.println("Error al insertar el registro.\n" + e.getMessage() + "\n" + sql);
        }
        conex.desconectar();
    }
    
    
    //BASE DE DATOS CON TABLA FRUTAS Y VERDURAS
    @Override
    public List<DatosFrutasVerduras> getAllDatosFrutasVerduras() {
        Statement st;
        ResultSet rs;
        List<DatosFrutasVerduras> lst = new ArrayList<>();
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "select * from db_frutasyverduras";
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                DatosFrutasVerduras d = new DatosFrutasVerduras();
                
                d.setNombre(rs.getString("nombre"));
                d.setPeso(Double.parseDouble(rs.getString("peso")));
                d.setSabor(rs.getString("sabor"));
                d.setOrigen(rs.getString("origen"));
                d.setTipo(rs.getString("tipo"));
                d.setColor(rs.getString("color"));
                d.setProteinas(Double.parseDouble(rs.getString("proteinas")));
                
                lst.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar todos los datos\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return lst; 
    }
    
    @Override
    public DatosFrutasVerduras getDatosFrutasVerduras(String nombre) {
        Statement st;
        ResultSet rs;
        DatosFrutasVerduras d = new DatosFrutasVerduras();
        String sql = "";
        
        conex.conectar();
        
        try {
            sql = "select * from db_frutasyverduras where nombre = '" + nombre + "'";
            st = conex.getConex().createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                d.setNombre(rs.getString("nombre"));
                d.setPeso(Double.parseDouble(rs.getString("peso")));
                d.setSabor(rs.getString("sabor"));
                d.setOrigen(rs.getString("origen"));
                d.setTipo(rs.getString("tipo"));
                d.setColor(rs.getString("color"));
                d.setProteinas(Double.parseDouble(rs.getString("proteinas")));
            }
        } catch (Exception e) {
            System.out.println("Error al consultar los datos por el Nombre\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return d;
    }
    
    @Override
    public void updateDatosFrutasVerduras(DatosFrutasVerduras d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "UPDATE db_frutasyverduras SET "
                    + "nombre=" + "'" + d.getNombre()+ "'" + ", "
                    + "peso=" + "'" + d.getPeso() + "'" + ", "
                    + "sabor=" + "'" + d.getSabor() + "'" + ", "
                    + "origen=" + "'" + d.getOrigen() + "'" + ", "
                    + "tipo=" + "'" + d.getTipo() + "'"
                    + "color=" + "'" + d.getColor() + "'" + ", "
                    + "proteinas=" + "'" + d.getProteinas() + "'" + ", "
                    + " WHERE nombre=" + d.getNombre();
            
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al modificar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }
    
    @Override
    public void deleteDatosFrutasVerduras(String nombre) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "delete from db_frutasyverduras where nombre =" + nombre;
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al borrar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }
    
    @Override
    public void insertarDatosFrutasVerduras(DatosFrutasVerduras d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "insert into db_frutasyverduras (nombre,peso,sabor,origen,tipo,color,proteinas) values ('"
                    + d.getNombre()+ "','"
                    + d.getPeso() + "','"
                    + d.getSabor() + "','"
                    + d.getOrigen() + "','"
                    + d.getTipo() + "','"
                    + d.getColor() + "','"
                    + d.getProteinas() + "')";
            
            st.execute(sql);

            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente en la base de datos");
        } catch (Exception e) {
            System.out.println("Error al insertar el registro.\n" + e.getMessage() + "\n" + sql);
        }
        conex.desconectar();
    }
    
    
    //BASE DE DATOS CON TABLA HIDRATOS DE CARBONO
    @Override
    public List<DatosHidratosCarbono> getAllDatosHidratosCarbono() {
        Statement st;
        ResultSet rs;
        List<DatosHidratosCarbono> lst = new ArrayList<>();
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "select * from db_hidratoscarbono";
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                DatosHidratosCarbono d = new DatosHidratosCarbono();
                
                d.setNombre(rs.getString("nombre"));
                d.setPeso(Double.parseDouble(rs.getString("peso")));
                d.setSabor(rs.getString("sabor"));
                d.setOrigen(rs.getString("origen"));
                d.setTipos(rs.getString("tipo"));
                d.setFuentes(rs.getString("fuente"));
                
                lst.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar todos los datos\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return lst; 
    }
    
    @Override
    public DatosHidratosCarbono getDatosHidratosCarbono(String nombre) {
        Statement st;
        ResultSet rs;
        DatosHidratosCarbono d = new DatosHidratosCarbono();
        String sql = "";
        
        conex.conectar();
        
        try {
            sql = "select * from db_hidratoscarbono where nombre = '" + nombre + "'";
            st = conex.getConex().createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                d.setNombre(rs.getString("nombre"));
                d.setPeso(Double.parseDouble(rs.getString("peso")));
                d.setSabor(rs.getString("sabor"));
                d.setOrigen(rs.getString("origen"));
                d.setTipos(rs.getString("tipo"));
                d.setFuentes(rs.getString("fuente"));
            }
        } catch (Exception e) {
            System.out.println("Error al consultar los datos por el Nombre\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return d;
    }
    
    @Override
    public void updateDatosHidratosCarbono(DatosHidratosCarbono d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "UPDATE db_hidratoscarbono SET "
                    + "nombre=" + "'" + d.getNombre()+ "'" + ", "
                    + "peso=" + "'" + d.getPeso() + "'" + ", "
                    + "sabor=" + "'" + d.getSabor() + "'" + ", "
                    + "origen=" + "'" + d.getOrigen() + "'" + ", "
                    + "tipo=" + "'" + d.getTipos() + "'"
                    + "fuente=" + "'" + d.getFuentes() + "'" + ", "
                    + " WHERE nombre=" + d.getNombre();
            
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al modificar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }
    
    @Override
    public void deleteDatosHidratosCarbono(String nombre) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "delete from db_hidratoscarbono where nombre=" + nombre;
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al borrar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }

    @Override
    public void insertarDatosHidratosCarbono(DatosHidratosCarbono d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "insert into db_hidratoscarbono (nombre,peso,sabor,origen,tipo,fuente) values ('"
                    + d.getNombre()+ "','"
                    + d.getPeso() + "','"
                    + d.getSabor() + "','"
                    + d.getOrigen() + "','"
                    + d.getTipos() + "','"
                    + d.getFuentes() + "')";
            
            st.execute(sql);

            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente en la base de datos");
        } catch (Exception e) {
            System.out.println("Error al insertar el registro.\n" + e.getMessage() + "\n" + sql);
        }
        conex.desconectar();
    }

    //BASES DE DATOS CON TABLA GRASAS
    @Override
    public List<DatosGrasas> getAllDatosGrasas() {
        Statement st;
        ResultSet rs;
        List<DatosGrasas> lst = new ArrayList<>();
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "select * from db_grasas";
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                DatosGrasas d = new DatosGrasas();
                
                d.setNombre(rs.getString("nombre"));
                d.setPeso(Double.parseDouble(rs.getString("peso")));
                d.setSabor(rs.getString("sabor"));
                d.setOrigen(rs.getString("origen"));
                d.setClases(rs.getString("clases"));
                
                lst.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar todos los datos\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return lst; 
    }
    
    @Override
    public DatosGrasas getDatosGrasas(String nombre) {
        Statement st;
        ResultSet rs;
        DatosGrasas d = new DatosGrasas();
        String sql = "";
        
        conex.conectar();
        
        try {
            sql = "select * from db_grasas where nombre = '" + nombre + "'";
            st = conex.getConex().createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {                
                d.setNombre(rs.getString("nombre"));
                d.setPeso(Double.parseDouble(rs.getString("peso")));
                d.setSabor(rs.getString("sabor"));
                d.setOrigen(rs.getString("origen"));
                d.setClases(rs.getString("clases"));
            }
        } catch (Exception e) {
            System.out.println("Error al consultar los datos por el Nombre\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
        return d;
    }

    @Override
    public void updateDatosGrasas(DatosGrasas d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "UPDATE db_usuario SET "
                    + "nombre=" + "'" + d.getNombre()+ "'" + ", "
                    + "peso=" + "'" + d.getPeso() + "'" + ", "
                    + "sabor=" + "'" + d.getSabor() + "'" + ", "
                    + "origen=" + "'" + d.getOrigen() + "'" + ", "
                    + "clase=" + "'" + d.getClases() + "'" + ", "
                    + " WHERE nombre=" + d.getNombre();
            
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al modificar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }

    @Override
    public void deleteDatosDatosGrasas(String nombre) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "delete from db_grasas where nombre=" + nombre;
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("Error al borrar el registro.\n" + e.getMessage()
                    + "\n" + sql);
        }
        conex.desconectar();
    }

    @Override
    public void insertarDatosDatosGrasas(DatosGrasas d) {
        Statement st;
        String sql = "";
        
        conex.conectar();
        
        try {
            st = conex.getConex().createStatement();
            sql = "insert into db_grasas (nombre,peso,sabor,origen,clase) values ('"
                    + d.getNombre()+ "','"
                    + d.getPeso() + "','"
                    + d.getSabor() + "','"
                    + d.getOrigen() + "','"
                    + d.getClases() + "')";
            
            st.execute(sql);

            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente en la base de datos");
        } catch (Exception e) {
            System.out.println("Error al insertar el registro.\n" + e.getMessage() + "\n" + sql);
        }
        conex.desconectar();
    }
}
