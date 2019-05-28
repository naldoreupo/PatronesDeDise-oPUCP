
package patronesdediseño.CadenaDeResponsabilidad;


public class SupervisorVentas implements IAprobador {
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
            if( monto < 5000 ){
                return "Supervisor Ventas";
            }
            else{
              return  next.solicitudPrestamo(monto);
            }
    }
    
}
