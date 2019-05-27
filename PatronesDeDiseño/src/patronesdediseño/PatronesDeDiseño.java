package patronesdediseño;

import patronesdediseño.CadenaDeResponsabilidad.AreaDeVentas;


public class PatronesDeDiseño {

    public static void main(String[] args) {
        System.out.println("inicio");

        AreaDeVentas areaDeVentas = new AreaDeVentas();
        areaDeVentas.solicitudPrestamo(300000);
    }
    
}
