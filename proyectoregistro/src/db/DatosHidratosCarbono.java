package db;

public class DatosHidratosCarbono extends Alimentos{
    private String tipos, fuentes;

    //CONSTRUCTOR VACIO
    public DatosHidratosCarbono() {
        super();
        tipos = null;
        fuentes = null;
    }
    
    //CONSTRUCTOR

    public DatosHidratosCarbono(String tipos, String fuentes, double peso, String Nombre, String sabor, String origen) {
        super(peso, Nombre, sabor, origen);
        this.tipos = tipos;
        this.fuentes = fuentes;
    }
    
    //METODOS GET AND SETTER

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getFuentes() {
        return fuentes;
    }

    public void setFuentes(String fuentes) {
        this.fuentes = fuentes;
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
