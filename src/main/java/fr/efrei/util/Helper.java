package fr.efrei.util;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        if (s.isEmpty() || s == null)
            return true;
        return false;
    }
}
