/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class TrabajadorValidator {
    
    public List<String> validate(Trabajador trabajador) {
        List<String> errors = new ArrayList<String>();
        Util util = new Util();
        String address = trabajador.getAddress();
        String dni = trabajador.getDni();
        String email = trabajador.getEmail();
        String firstName = trabajador.getFirstName();
        String lastName = trabajador.getLastName();
        String phoneNumber = trabajador.getPhoneNumber();

        if (address == null || address.isEmpty()) {
            errors.add("Debe completar la direccion de domicilio");
        }
        
        if (dni == null || dni.isEmpty()) {
            errors.add("Debe completar la direccion de domicilio");
        } else {
            if (dni.length() != 8) {
                errors.add("El campo DNI debe tener 8 dígitos");
            }
        }
        
        if (email == null || email.isEmpty()) {
            errors.add("Debe completar el correo electronico");
        } else {
            if (!util.isEmail(email)) {
                errors.add("El correo debe estar en formato válido");
            }
        }
        
        if (firstName == null || firstName.isEmpty()) {
            errors.add("Debe completar el nombre");
        }

        if (lastName == null || lastName.isEmpty()) {
            errors.add("Debe completar loas apellidos");
        }
        
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            errors.add("Debe completar el número telefonico");
        } else {
            if (phoneNumber.length() != 9) {
                errors.add("El número telefónico debe tener 9 digitos");
            }
        }

        return errors;
    }
    
}
