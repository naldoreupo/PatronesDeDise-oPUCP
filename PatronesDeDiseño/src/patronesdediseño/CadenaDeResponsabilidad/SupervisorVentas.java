
package patronesdediseño.CadenaDeResponsabilidad;

import patronesdediseño.composite.Trabajador;


public class SupervisorVentas extends Trabajador implements IAprobador {
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
    public String solicitudPrestamo(int monto) {
            if( monto < 10000 ){
                return "Supervisor Ventas";
            }
            else{
              return  next.solicitudPrestamo(monto);
            }
    }
    
}
