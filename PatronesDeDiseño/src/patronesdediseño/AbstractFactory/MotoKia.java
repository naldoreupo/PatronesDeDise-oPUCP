package patronesdediseño.AbstractFactory;

public class MotoKia implements IMoto{

    private String nombre;
    private double precio;

    public MotoKia() {
        this.nombre = "Moto Kia";
        this.precio = 3400;
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
