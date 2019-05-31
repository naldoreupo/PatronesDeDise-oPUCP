package patronesdediseño.SinAbstractFactory;

public class MotoMitsubishi {

    private String nombre;
    private double precio;

    public MotoMitsubishi() {
        this.nombre = "Moto Mitsubishi";
        this.precio = 3600;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

}
