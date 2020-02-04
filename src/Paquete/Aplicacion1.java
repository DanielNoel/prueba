/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Aplicacion1 {
    /*******************Atributos********************/
    static Scanner sc;static String dato="";
    static clsNumero objnum=new clsNumero();
    static clsEvaluador objEvaluador=new clsEvaluador();
    static clsCadena objcadena=new clsCadena();
    static int Numeros[]=new int[15];
    static int canelem=0;
    /*******************Atributos********************/
    
    /*******************Métodos********************/
    static public void CapturaDato(){
     sc=new Scanner(System.in); 
      System.out.println("Introduzca un numero: ");       
      dato = sc.nextLine();    
    }
    static public void CapturaDatoCadena(){
     sc=new Scanner(System.in); 
      System.out.println("Por favor ingrese una cadena de caracteres: ");       
      dato = sc.nextLine();    
    }
    static public void LlenarArreglo(){
      canelem=0;
      sc=new Scanner(System.in); 
      do{
       System.out.println("Ingrese el Numero["+(canelem+1)+"]");
       dato = sc.nextLine();    
       if(objEvaluador.CondicionMayor(Integer.parseInt(dato),0)){
         Numeros[canelem]=Integer.parseInt(dato);   
        canelem++;   
       }
      }
      while(canelem<Numeros.length);
    }    
    static public void MostrarDatosArreglo(){
      if(canelem==Numeros.length){
       for(int i=0;i<Numeros.length;i++)
        System.out.println("Numeros["+i+"]="+Numeros[i]);
      }
    }    
    static public void Solucion3(){
     CapturaDato();
     if(objEvaluador.EvaluaRango(1, 10, Integer.parseInt(dato))){
       System.out.println("Resultado: "+objnum.NumeroTextual(Integer.parseInt(dato)));
     }
     else{
       System.out.println("El Numero "+dato+" Esta Fuera del Rango del (1...10)");
     }
    }
    static public void Solucion4(){
     CapturaDato();
     if(objEvaluador.EvaluaRango(1, 9, Integer.parseInt(dato))){
       System.out.println("Resultado: "+objnum.FactorialConDo_While(Integer.parseInt(dato)));
     }
     else{
       System.out.println("El Numero "+dato+" Esta Fuera del Rango del (1...9)");
     }
    }
    static public void Solucion5(){
     CapturaDato();
     if(objEvaluador.EvaluaLongCadena(dato)){
       System.out.println("Resultado: La cantidad de Vocales en la Cadena \n"+dato
        +" Es: "+objcadena.Cant_Vocales(dato));
     }
     else{
       System.out.println("No ingresaste ningun valor");
     }
    }
    static public void Solucion6(){
     dato="";CapturaDatoCadena();
     while(objEvaluador.EvaluaLongCadena(dato)==false){
        CapturaDatoCadena(); 
     }
      System.out.println("Resultado: La Vocales en la Cadena \n"+dato
      +" Es: "+objcadena.getVocales(dato));
    }
    static public void Solucion7(){
     dato="";CapturaDatoCadena();
     while(objEvaluador.EvaluaLongCadena(dato)==false){
        CapturaDatoCadena(); 
     }
     while(objEvaluador.EvaluaEscrituraCadena(dato)==false){
        CapturaDatoCadena(); 
     }
      System.out.println("Resultado: Las priemeras letras de la Cadena \n"+dato
      +" Es: "+objcadena.PrmLetras(dato));
    }
    static public void Solucion8(){
     dato="";CapturaDatoCadena();
     if(objEvaluador.EvaluaEscrituraCadena(dato)){
      System.out.println("Cadena correcta");   
     }
     else{
      System.out.println("Cadena incorrecta");
     }
    }
    
    static public void Solucion9(){
     dato="";CapturaDatoCadena();
     while(objEvaluador.EvaluaLongCadena(dato)==false){
        CapturaDatoCadena(); 
     }
     if(objEvaluador.DeterExisteSimbEnCad(dato, '$'))
      System.out.println("Resultado:  la Cadena \n"+dato
      +" Si contiene al simbolo del dolar");   
     else
      System.out.println("Resultado:  la Cadena \n"+dato
      +" No contiene al simbolo del dolar"); 
    }
    static public void MostrarResultados(){
     System.out.println(objnum.ParImpar(Integer.parseInt(dato)));
    }
    public static void main(String[] args) {
       objnum.GeneraNumeros_sinotros(1,7);
    }
    /*******************Métodos********************/    
}
