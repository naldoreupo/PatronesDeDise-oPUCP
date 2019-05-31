package patronesdediseño.SinAbstractFactory;

public class BusMitsubishi {

    private String nombre;
    private double precio;

    public BusMitsubishi() {
        this.nombre = "Bus Mitsubishi";
        this.precio = 26500;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
