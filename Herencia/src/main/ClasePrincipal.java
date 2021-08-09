package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
   public static void main(String args[]){
       
       ClaseHija_Suma MensajeroSuma = new ClaseHija_Suma();
       MensajeroSuma.PedirDatos();
       MensajeroSuma.Sumar();
       System.out.print("El resultado de la suma es: ");
       MensajeroSuma.MostrarResultado();
       
       ClaseHija_Resta MensajeroResta = new ClaseHija_Resta();
       MensajeroResta.PedirDatos();
       MensajeroResta.Restar();
       System.out.print("El resultado de la resta es: ");
       MensajeroResta.MostrarResultado();
   }
}
