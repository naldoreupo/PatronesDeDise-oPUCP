package patronesdediseño.SinAbstractFactory;

public class AutoMitsubishi {

    private String nombre;
    private double precio;

    public AutoMitsubishi() {
        this.nombre = "Auto AutoMitsubishi";
        this.precio = 15700;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
