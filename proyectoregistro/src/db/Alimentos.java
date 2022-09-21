package db;

public abstract class Alimentos {
    protected double peso;
    protected String nombre, sabor, origen;

    
    //CONSTRUCTOR VACIO
    public Alimentos() {
        peso = 0.0;
        nombre = null;
        sabor = null;
        origen = null;
    }
    
    //CONSTRUCTOR
    public Alimentos(double peso, String Nombre, String sabor, String origen) {
        this.peso = peso;
        this.nombre = Nombre;
        this.sabor = sabor;
        this.origen = origen;
    }

    //METODOS GET AND SETTER
}
