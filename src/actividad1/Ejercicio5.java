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
public class Ejercicio5 {
     public static void main(String[] args) {
        int aActual, mActual, dActual, aNac, mNac, dNac, edad;//declaramos 6 variables enteras
        System.out.println("Calculador de edad");//Muestra en pantalla el título del programa
        Scanner sc = new Scanner(System.in);
        System.out.println("inserta tu año de nacimiento: ");
        aNac = sc.nextInt();//asignamos el valor introducido a la variable aNac
        System.out.println("inserta tu mes de nacimiento: ");
        mNac = sc.nextInt();//asignamos el valor introducido a la variable mNac
        System.out.println("inserta tu día de nacimiento: ");
        dNac = sc.nextInt();//asignamos el valor a la variable dNac
        System.out.println("inserte año actual: ");
        aActual = sc.nextInt();//asignamos el valor introducido a la variable aActual
         System.out.println("inserte mes actual: ");
        mActual = sc.nextInt();//asignamos el valor introducido a la variable mActual
         System.out.println("inserte día actual: ");
        dActual = sc.nextInt();//asignamos el valor introducido a la variable dActual
        edad = mActual > mNac || (mActual == mNac && dActual > dNac) ? (aActual - aNac) : (aActual - aNac) - 1;//comparamos los valores de año, mes y dia de nacimiento y actuales y pedimos resultado con ternario.
        
        
        System.out.println("Su edad es: " + edad + " años");//mostramos el resultado
     }
        
    
}
