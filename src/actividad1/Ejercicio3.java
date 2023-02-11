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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        double base, altura, areaTriangulo; //declaramos 3 variables reales
        System.out.println("Cálculo del área de un triángulo");//salida por pantalla del título del programa
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("inserte base del triángulo: ");//pedimos primera medida
        base = sc.nextDouble();//asignamos el valor a la variable base
        System.out.print("inserte altura del triángulo: ");//pedimos la segunda medida
        altura = sc.nextDouble();//asignamos el valor a la variable altura
        areaTriangulo = base * altura / 2;//asignamos a la variable areaTriangulo el valor de la operación 
        System.out.println("El área del triángulo es: " + areaTriangulo);//muestra el resultado en pantalla
        
    }
    
}
