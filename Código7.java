package com.codigo7;

import java.util.HashMap;//se importó Hashmap
import java.util.Scanner;//se importó scanner

public class Código7 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);//Se agregó System.in

    HashMap<String, String> capitales = new HashMap<>(); // ca --> capitales / byte, double --> String, String

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador");//se agregó capital
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c;//Se completó la palabra String. c almacena el nombre del país
   
    //while (!c.equals("salir")) {
    do {
      System.out.println("Escribe el nombre de un país y te diré su capital, o escribe salir, para terminar.");//in --> out
      c = s.nextLine(); //se quitó el double //se agregó String / c almacena el país ingresado
      
      if (!c.equals("salir")) { //se completó equals
        if (capitales.containsKey(c)) { //ca--> capitales //Containskey en lugar de containsvalue
          System.out.print("La capital de " + c);//se agregó el out 
          System.out.println(" es " + capitales.get(c));//put --> get
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String capital = s.nextLine();
          capitales.put(c, capital);
          System.out.println("Gracias por enseñarme nuevas capitales");
        		}
      		}
        }while (!c.equals("salir"));
      
        s.close();
    	}
    
    }
