package patronesdediseño.AbstractFactory;

public class MotoMitsubishi implements IMoto{

    private String nombre;
    private double precio;

    public MotoMitsubishi() {
        this.nombre = "Moto Mitsubishi";
        this.precio = 3600;
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
