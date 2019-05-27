/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.CadenaDeResponsabilidad;


public class AreaDeVentas implements IAprobador {

    IAprobador next;
    
    @Override
    public void setNext(IAprobador aprobador) {
            this.next=aprobador;
    }

    @Override
    public IAprobador getNext() {
        return next;
         }

    @Override
    public void solicitudPrestamo(int monto) {
       
        SupervisorVentas supervisorVentas = new SupervisorVentas(); 
        this.setNext(supervisorVentas);
        
        JefeDeVentas jefeDeVentas = new JefeDeVentas();
        supervisorVentas.setNext(jefeDeVentas);
        
        GerenteDeZona gerenteDeZona = new GerenteDeZona();
        jefeDeVentas.setNext(gerenteDeZona);
        
        GerenteDeVentas gerenteDeVentas = new GerenteDeVentas();
        gerenteDeZona.setNext(gerenteDeVentas);
        
        next.solicitudPrestamo(monto);
    }
    
}
