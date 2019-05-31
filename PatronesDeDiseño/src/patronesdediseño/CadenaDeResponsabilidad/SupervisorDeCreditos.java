
package patronesdediseño.CadenaDeResponsabilidad;

import patronesdediseño.composite.Trabajador;


public class SupervisorDeCreditos extends Trabajador implements IAprobador {
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
            if( monto >= 50000 && monto <10000 ){
                return "Supervisor de créditos";
            }
            else{
              return  next.solicitudPrestamo(monto);
            }
    }
    
}
