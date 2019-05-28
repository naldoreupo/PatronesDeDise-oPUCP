package patronesdediseño.AbstractFactory;

public class AutoKia implements IAuto {

    private String nombre;
    private double precio;

    public AutoKia() {
        this.nombre = "Auto Kia";
        this.precio = 13500;
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
