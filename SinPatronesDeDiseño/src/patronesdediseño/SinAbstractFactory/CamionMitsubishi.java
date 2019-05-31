package patronesdediseño.SinAbstractFactory;

public class CamionMitsubishi {

    private String nombre;
    private double precio;

    public CamionMitsubishi() {
        this.nombre = "Camión Mitsubishi";
        this.precio = 37500;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
