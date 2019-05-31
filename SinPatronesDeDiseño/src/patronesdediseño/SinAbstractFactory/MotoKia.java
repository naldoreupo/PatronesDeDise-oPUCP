package patronesdediseño.SinAbstractFactory;

public class MotoKia {

    private String nombre;
    private double precio;

    public MotoKia() {
        this.nombre = "Moto Kia";
        this.precio = 3400;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }

}
