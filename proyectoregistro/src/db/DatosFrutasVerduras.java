package db;

public class DatosFrutasVerduras extends Alimentos{

    private double proteinas;
    private String color, tipo;

    //COSTRUCTOR VACIO
    public DatosFrutasVerduras() {
        super();
        proteinas = 0.0;
        color = null;
        tipo = null;
    }
    
    //CINSTRUCTOR
    public DatosFrutasVerduras(double proteinas, String color, String tipo, double peso, String Nombre, 
            String sabor, String origen) {
        super(peso, Nombre, sabor, origen);
        this.proteinas = proteinas;
        this.color = color;
        this.tipo = tipo;
    }
    
    //METODOS

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
