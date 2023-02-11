/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author vanes
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int Actual, Nacimiento, edad;//declaramos tres variables enteras
        System.out.println("Calculador de edad");//Muestra en pantalla el título del programa
        Scanner sc = new Scanner(System.in);
        System.out.println("inserta tu año de nacimiento: ");
        Nacimiento = sc.nextInt();//asignamos el valor introducido a la variable Nacimiento
        System.out.println("inserte año actual: ");
        Actual = sc.nextInt();//asignamos el valor introducido a la variable Actual
        edad = Actual - Nacimiento; //asignamos el valor de la operación a la variable edad
        System.out.println("Su edad es: " + edad + " años");//mostramos el resultado
        
        
        
    }
    
}
