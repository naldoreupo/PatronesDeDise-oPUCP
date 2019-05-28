package patronesdediseño.AbstractFactory;

public class MotoToyota implements IMoto {

    private String nombre;
    private double precio;

    public MotoToyota() {
        this.nombre = "Moto Toyota";
        this.precio = 2900;
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
