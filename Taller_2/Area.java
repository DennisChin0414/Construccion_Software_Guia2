/**
 * Write a description of class Area here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 18-ago-2019
 */
import java.util.Scanner;
import java.lang.Math;
public class Area
{
    public static void main(String [] args)
    {
       System.out.println("------------------------------------------------");
       System.out.println("Guia 2 Actividad 1 Programa 2 Calculo de área");
       System.out.println("------------------------------------------------");     
       // asociar teclado al programa
       Scanner teclado = new Scanner(System.in);
       // declarar variables
       double radio;
       double area_circulo, area_cuadrado;
       double area_sombreada;
       // Solicitar datos de entrada
       System.out.println("Ingrese el radio en formato (00,00)");
       radio = teclado.nextDouble(); 
       // valida valor ingresado
       if (radio >=0 ){
          System.out.println("Se calculará el área con el radio " + radio);
        }else{
          System.out.println("Valor ingrsado para el radio errado ");}
       //operaciones 
       area_circulo = Math.PI * Math.pow(radio,2);
       area_cuadrado = Math.pow(radio,2) + Math.pow(radio,2);
       area_sombreada = area_circulo - area_cuadrado;
       System.out.println("El área sombreada que está entre el círculo y el cuadrado  es " + area_sombreada);
    }
}