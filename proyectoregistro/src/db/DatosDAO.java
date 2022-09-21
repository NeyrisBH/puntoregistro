package db;

import java.util.List;

public interface DatosDAO {
    
    //TODOS LOS DATOS - LISTA
    List<DatosUsuario> getAllDatosUsuarios();
    List<DatosFrutasVerduras> getAllDatosFrutasVerduras();
    List<DatosHidratosCarbono> getAllDatosHidratosCarbono();
    List<DatosGrasas> getAllDatosGrasas();
    
    //CONSULATA DATOS
    DatosUsuario getDatosUsuarios(String usuario);
    DatosFrutasVerduras getDatosFrutasVerduras(String nombre);
    DatosHidratosCarbono getDatosHidratosCarbono(String nombre);
    DatosGrasas getDatosGrasas(String nombre);
    
    //METODOS CRUD
    void updateDatosUsuarios(DatosUsuario d);
    void deleteDatosUsuarios(String usuario);
    void insertarDatosUsuarios(DatosUsuario d);
    
    void updateDatosFrutasVerduras(DatosFrutasVerduras d);
    void deleteDatosFrutasVerduras(String nombre);
    void insertarDatosFrutasVerduras(DatosFrutasVerduras d);
    
    void updateDatosHidratosCarbono(DatosHidratosCarbono d);
    void deleteDatosHidratosCarbono(String nombre);
    void insertarDatosHidratosCarbono(DatosHidratosCarbono d);
    
    void updateDatosGrasas(DatosGrasas d);
    void deleteDatosDatosGrasas(String nombre);
    void insertarDatosDatosGrasas(DatosGrasas d);
}
