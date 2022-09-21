package db;

public class DatosGrasas extends Alimentos{
    private String clases;

    //CONSTRUCTOR VACIO

    public DatosGrasas() {
        super();
        clases = null;
    }
    
    //COSNTRUCTOR

    public DatosGrasas(String clases, double peso, String Nombre, String sabor, String origen) {
        super(peso, Nombre, sabor, origen);
        this.clases = clases;
    }
    
    
    //METODOS GET AND SETTER

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
