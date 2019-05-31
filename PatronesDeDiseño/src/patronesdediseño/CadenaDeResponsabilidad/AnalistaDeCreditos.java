package patronesdediseño.CadenaDeResponsabilidad;

import patronesdediseño.composite.Trabajador;


public class AnalistaDeCreditos extends Trabajador implements IAprobador {

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
            if( monto < 5000){
                return "Analista de Créditos";
            }
            else{
              return  next.solicitudPrestamo(monto);
            }   
            
    }
}
