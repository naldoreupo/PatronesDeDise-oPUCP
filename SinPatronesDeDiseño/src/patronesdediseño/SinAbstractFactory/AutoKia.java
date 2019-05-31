package patronesdediseño.SinAbstractFactory;

public class AutoKia {

    private String nombre;
    private double precio;

    public AutoKia() {
        this.nombre = "Auto Kia";
        this.precio = 13500;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
