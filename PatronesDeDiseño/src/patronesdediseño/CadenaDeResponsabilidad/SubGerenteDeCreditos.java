/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.CadenaDeResponsabilidad;

import patronesdediseño.composite.Trabajador;


public class SubGerenteDeCreditos extends Trabajador  implements IAprobador {

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
            if( monto >= 20000 && monto < 30000){
               return "Sub Gerente de créditos";
            }
            else{
              return  next.solicitudPrestamo(monto);
            }    
            
    }
}
