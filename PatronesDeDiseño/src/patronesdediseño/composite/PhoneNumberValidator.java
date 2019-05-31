/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author carlos
 */
public class PhoneNumberValidator implements Validator<Trabajador> {

    @Override
    public List<String> validate(Trabajador info) {
        List<String> errors = new ArrayList<String>();
        String phoneNumber = info.getPhoneNumber();
        String pattern = "\\d{9}";
        Pattern pat = Pattern.compile(pattern); 

        if (phoneNumber == null || phoneNumber.isEmpty()) {
            errors.add("Debe completar el número telefonico");
        } else {
            if (phoneNumber.length() != 9) {
                errors.add("El número telefónico debe tener 9 digitos");
            } else {
                if (!pat.matcher(phoneNumber).matches()) {
                    errors.add("El número telefónico debe estar en formato válido");
                }
            }
        }

        return errors;
    }
    
}
