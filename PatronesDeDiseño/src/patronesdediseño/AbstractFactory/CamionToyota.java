package patronesdediseño.AbstractFactory;

public class CamionToyota implements ICamion {

    private String nombre;
    private double precio;

    public CamionToyota() {
        this.nombre = "Camión Toyota";
        this.precio = 32800;
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
