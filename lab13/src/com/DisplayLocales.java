package com;

import java.util.*;
import java.text.*;

public class DisplayLocales {
    //Luam Localele din sistem si le afisam, straight forward.
    static public void main() {
        Locale list[] = DateFormat.getAvailableLocales();
        for (Locale aLocale : list) {
            System.out.println(aLocale.toString());
        }
    }
}
