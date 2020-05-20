package com;

import java.util.Locale;

public class SetLocale {
    // nu stiu daca chiar asta era de facut aici
    // dar schimb Default Locale in functie de parametrul dat functiei
    public void exec(Locale current){
        Locale.setDefault(current);
    }

}
