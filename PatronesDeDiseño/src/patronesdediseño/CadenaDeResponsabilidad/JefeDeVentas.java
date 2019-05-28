package patronesdediseño.CadenaDeResponsabilidad;


public class JefeDeVentas implements IAprobador {

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
            if( monto >= 5000 && monto < 10000){
                return "Aprobado por Jefe de ventas";
            }
            else{
                next.solicitudPrestamo(monto);
            }   
            
      return "Crédito no aprobado";
    }
}
