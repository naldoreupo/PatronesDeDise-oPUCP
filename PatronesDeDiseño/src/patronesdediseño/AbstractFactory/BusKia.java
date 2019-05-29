package patronesdediseño.AbstractFactory;

public class BusKia implements IBus{

    private String nombre;
    private double precio;

    public BusKia() {
        this.nombre = "Bus Kia";
        this.precio = 23000;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
    
}
