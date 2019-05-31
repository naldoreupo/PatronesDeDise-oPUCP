package patronesdediseño.SinAbstractFactory;

public class BusToyota {

    private String nombre;
    private double precio;

    public BusToyota() {
        this.nombre = "Bus Toyota";
        this.precio = 27650;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
