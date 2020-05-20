package compulsory;


import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.text.DateFormatSymbols;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int KeepGoing = 1;
        //am definit doua Locale cu care voi lucra ulterior
        Locale roLocale = new Locale("ro","RO");
        Locale enLocale = new Locale("en","US");

        //cat timp nu s-a citit exit sa astepata input de la utilizator
        while (KeepGoing == 1){

            System.out.println("input command:");

            //creere buffer de input
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            // citire date
            String name = null;
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // nu am inteles la ce trebuiau mai exact folosite filele de tip
            // .propreties, am inteles ca sunt pentru mapparea cuvintelor cheie
            // sunt singurele care nu le-am folosit, dar le-am creat dupa cerinta

            //in functie de input de la user facem afisarea informatiilor sau schimbare
            // default Locale
            if (name.equals("locales")){
                DisplayLocales.main();
            }else if (name.equals("locale.set ro_RO")){
                Locale.setDefault(roLocale);
            }else if (name.equals("locale.set en_US")){
                Locale.setDefault(enLocale);
            }else if (name.equals("info")){
                Info.printDetails(Locale.getDefault());
            }else if (name.equals("exit")){
                KeepGoing = 0;
            }else{
                System.out.println("Invalid");
            }

        }

    }
}
