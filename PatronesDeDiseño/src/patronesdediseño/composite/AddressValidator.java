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
public class AddressValidator implements Validator<Trabajador> {

    @Override
    public List<String> validate(Trabajador info) {
        List<String> errors = new ArrayList<String>();
        String address = info.getAddress();

        if (address == null || address.isEmpty()) {
            errors.add("Debe completar la direccion de domicilio");
        }

        return errors;
    }
    
}
