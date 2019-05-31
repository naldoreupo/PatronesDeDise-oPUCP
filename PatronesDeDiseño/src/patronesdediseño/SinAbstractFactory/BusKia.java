package patronesdediseño.SinAbstractFactory;

public class BusKia{

    private String nombre;
    private double precio;

    public BusKia() {
        this.nombre = "Bus Kia";
        this.precio = 23000;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
}
