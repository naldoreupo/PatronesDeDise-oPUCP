package patronesdediseño.AbstractFactory;

public class BusToyota implements IBus {

    private String nombre;
    private double precio;

    public BusToyota() {
        this.nombre = "Bus Toyota";
        this.precio = 27650;
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
