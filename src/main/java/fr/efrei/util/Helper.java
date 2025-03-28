/* Helper.java
Helper class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.util;

import org.apache.commons.validator.EmailValidator;

public class Helper {

    public static boolean isValidEmail(String userEmail) {
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(userEmail)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isNullOrEmpty(String s) {
        if (s.isEmpty() || s == null)
            return true;

        return false;
    }
}
