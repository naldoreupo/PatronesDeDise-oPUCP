package patronesdediseño.SinAbstractFactory;

public class AutoToyota{

    private String nombre;
    private double precio;

    public AutoToyota() {
        this.nombre = "Auto Toyota";
        this.precio = 12000;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
