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
public class NameValidator implements Validator<Trabajador> {

    @Override
    public List<String> validate(Trabajador info) {
        List<String> errors = new ArrayList<String>();
        String firstName = info.getFirstName();
        String lastName = info.getLastName();

        if (firstName == null || firstName.isEmpty()) {
            errors.add("Debe completar el nombre");
        }

        if (lastName == null || lastName.isEmpty()) {
            errors.add("Debe completar loas apellidos");
        }

        return errors;
    }
    
}
