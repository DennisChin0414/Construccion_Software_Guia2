/**
* Write a description of class Ventas here.
* @author Dennis Urrea/Alejandro Rodriguez Mancera 
* @version 18-ago-2019
*/
import java.util.Scanner;
public class Ventas {
 public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  // definicion variables
  int presupuesto=0;
  int numcompra=0;
  int compra=0;
  int sumacompra=0;
  System.out.println("------------------------------------------------"); 
  System.out.println("Guia 2 Actividad 1 Programa 4 Calculo Impuesto  ") ;
  System.out.println("------------------------------------------------");   
  System.out.println("Introduce presupuesto para compras");
  presupuesto = teclado.nextInt();
  if (presupuesto > 0){
      System.out.println("el valor ingresado es " + presupuesto);
    }else{
      System.out.println("ingrese presupuesto valido, vuelva a ejecutar ");
  }
  while (presupuesto>0){
   for (int i=1;i<presupuesto;i++){
   //solicito el precio de la compra
   System.out.println("Ingrese precio del producto " + i+": ");
   compra = teclado.nextInt();
   //Acumulamos el valor de la compra
   sumacompra = (sumacompra+compra);
   presupuesto = (presupuesto - sumacompra);
   }
  System.out.println("Valor total de las compras...." + sumacompra);
  System.out.println("valor final del presupuesto..." +presupuesto);
  }
 }
}