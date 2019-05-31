package patronesdediseño.SinAbstractFactory;

public class CamionKia {

    private String nombre;
    private double precio;

    public CamionKia() {
        this.nombre = "Camión Kia";
        this.precio = 35000;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
