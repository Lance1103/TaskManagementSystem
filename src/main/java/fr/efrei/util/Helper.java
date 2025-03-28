package fr.efrei.util;

import org.apache.commons.validator.EmailValidator;

public class Helper {

    public static boolean isValidEmail(String userEmail) {
        EmailValidator validotor = EmailValidator.getInstance();
        if (validotor.isValid(userEmail)) {
            return true;
        }
        else {
            return false;
        }

    }
}
