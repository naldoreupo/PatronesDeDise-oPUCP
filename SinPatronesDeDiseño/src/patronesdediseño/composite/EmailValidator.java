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
public class EmailValidator implements Validator<Trabajador> {

    @Override
    public List<String> validate(Trabajador info) {
        List<String> errors = new ArrayList<String>();
        String email = info.getEmail();
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
        Pattern pat = Pattern.compile(emailRegex); 

        if (email == null || email.isEmpty()) {
            errors.add("Debe completar el correo electronico");
        } else {
            if (!pat.matcher(email).matches()) {
                errors.add("El correo debe estar en formato válido");
            }
        }

        return errors;
    }
    
}
