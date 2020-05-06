package com.example.demo;
// Oracle connection tutorial: https://www.javatpoint.com/example-to-connect-to-the-oracle-database
import java.sql.*;

public class Game {
    public static void Game(int state){
        try{
            //driver BD
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //conexiune la BD
            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","student","STUDENT");

            //pregatim statement-ul de rulat
            Statement stmt=con.createStatement();

            //executam query ca string

            //nu am pus nimic deoarece nu sunt request-uri pentru Game

            //inchidere conexiune
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
