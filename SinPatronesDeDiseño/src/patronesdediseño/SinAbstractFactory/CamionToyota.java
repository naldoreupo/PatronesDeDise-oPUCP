package patronesdediseño.SinAbstractFactory;

public class CamionToyota {

    private String nombre;
    private double precio;

    public CamionToyota() {
        this.nombre = "Camión Toyota";
        this.precio = 32800;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
