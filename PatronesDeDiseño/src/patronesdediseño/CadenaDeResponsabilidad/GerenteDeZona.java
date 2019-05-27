/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.CadenaDeResponsabilidad;


public class GerenteDeZona implements IAprobador {

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
            if( monto >= 10000 && monto < 20000){
                System.out.println("Aprobado por Gerente de zona");
            }
            else{
                next.solicitudPrestamo(monto);
            }    
    }
}
