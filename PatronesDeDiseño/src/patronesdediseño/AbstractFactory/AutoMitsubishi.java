package patronesdediseño.AbstractFactory;

public class AutoMitsubishi implements IAuto {

    private String nombre;
    private double precio;

    public AutoMitsubishi() {
        this.nombre = "Auto AutoMitsubishi";
        this.precio = 15700;
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
