package patronesdediseño.AbstractFactory;

public class CamionKia implements ICamion {

    private String nombre;
    private double precio;

    public CamionKia() {
        this.nombre = "Camión Kia";
        this.precio = 35000;
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
