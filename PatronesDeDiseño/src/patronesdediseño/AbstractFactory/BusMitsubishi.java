package patronesdediseño.AbstractFactory;

public class BusMitsubishi implements IBus {

    private String nombre;
    private double precio;

    public BusMitsubishi() {
        this.nombre = "Bus Mitsubishi";
        this.precio = 26500;
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
