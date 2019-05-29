package patronesdediseño.AbstractFactory;

public class AutoToyota implements IAuto {

    private String nombre;
    private double precio;

    public AutoToyota() {
        this.nombre = "Auto Toyota";
        this.precio = 12000;
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
