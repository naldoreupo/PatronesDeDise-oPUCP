
package patronesdediseño.CadenaDeResponsabilidad;

import java.util.Date;
import patronesdediseño.roles.Role;
import patronesdediseño.roles.Trabajador;


public class SupervisorVentas extends Trabajador implements IAprobador {
    IAprobador next;

    public SupervisorVentas(String firstName, String lastName, String email, String phoneNumber, Date birthdate, String Address, Date dateAdmission, String dni, double salary, Role role) {
        super(firstName, lastName, email, phoneNumber, birthdate, Address, dateAdmission, dni, salary, role);
    }
    
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
