/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author matenadaran
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
