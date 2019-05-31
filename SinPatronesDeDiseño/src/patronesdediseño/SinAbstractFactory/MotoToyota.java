package patronesdediseño.SinAbstractFactory;

public class MotoToyota {

    private String nombre;
    private double precio;

    public MotoToyota() {
        this.nombre = "Moto Toyota";
        this.precio = 2900;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

}
