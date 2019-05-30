/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdediseño.composite;

import java.util.List;

/**
 *
 * @author carlos
 * @param <T>
 */
public interface Validator<T> {
    List<String> validate(T info);
}
