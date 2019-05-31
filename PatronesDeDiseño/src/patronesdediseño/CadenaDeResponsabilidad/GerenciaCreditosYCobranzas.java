/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.CadenaDeResponsabilidad;


public class GerenciaCreditosYCobranzas implements IAprobador {

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
       
        AnalistaDeCreditos analistaDeCreditos = new AnalistaDeCreditos();
        this.setNext(analistaDeCreditos);
        
        SupervisorDeCreditos supervisorDeCreditos = new SupervisorDeCreditos(); 
        analistaDeCreditos.setNext(supervisorDeCreditos);        
        
        SubGerenteDeCreditos subGerenteDeCreditos = new SubGerenteDeCreditos();
        supervisorDeCreditos.setNext(subGerenteDeCreditos);        
        
        return next.solicitudPrestamo(monto);
    }
    
}
