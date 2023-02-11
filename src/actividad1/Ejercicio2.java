/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;
import java.util.Scanner;
import java.lang.System;
import java.util.Locale;



/**
 *
 * @author vanes
 */
public class Ejercicio2 {
  
        
 public static void main(String[] args) {
     
    double dist1,dist2,dist3; 
    System.out.print("inserte distancia1 en milímetros: ");//salida por cosola, pide dist1. 
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    dist1 = sc.nextDouble();//lee número real para variable dist1
     System.out.println("inserte distancia 2 en centímetros: ");//solicita la 2 medida.
     dist2 = sc.nextDouble();// lee nº real para variable dist2
     System.out.println("inserte distancia 3 en metros: ");//solicita la 3 medida
     dist3 = sc.nextDouble();//lee nº real para variable dist3
     double disttotal; //declaro la variable real
     disttotal = dist1 /10 + dist2 + dist3 * 100;//sumamos las medidas
     System.out.println("la longitud total es: " + disttotal + "cm");//muestra la longitud total en cm
    }
     
           
    
    
}
