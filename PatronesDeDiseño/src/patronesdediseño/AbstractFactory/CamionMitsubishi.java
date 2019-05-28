package patronesdediseño.AbstractFactory;

public class CamionMitsubishi implements ICamion{

    private String nombre;
    private double precio;

    public CamionMitsubishi() {
        this.nombre = "Camión Mitsubishi";
        this.precio = 37500;
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
