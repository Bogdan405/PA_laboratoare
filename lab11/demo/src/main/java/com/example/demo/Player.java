package com.example.demo;
// Oracle connection tutorial: https://www.javatpoint.com/example-to-connect-to-the-oracle-database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Player {
    public static void Player(int state, String param){
        try{
            //driver BD
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //conexiune la BD
            Connection con= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","student","STUDENT");

            //pregatim statement-ul de rulat
            Statement stmt=con.createStatement();

            //executam query ca string
            if(state == 1){
                ResultSet rs1=stmt.executeQuery("select * from players");
                while(rs1.next())
                    System.out.println(rs1.getString(1));
            }
            else if(state == 2) {
                ResultSet rs1=stmt.executeQuery("insert into Players(name) values ('player2')");
                rs1.next();
            }
            else if (state == 3){
                ResultSet rs1=stmt.executeQuery("update Players set name = 'player2' where name like ('player1')");
                rs1.next();
            }
            else if (state == 4){
                ResultSet rs1=stmt.executeQuery("delete from Playerswhere name like ('player1')");
                rs1.next();
            }
            //inchidere conexiunea
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
