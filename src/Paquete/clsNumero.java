/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete;

import javax.swing.JLabel;

/**** @author User MASZ */

public class clsNumero {
    
  public String FactorialConWhile(int nm){
    int f=1,n=1;
    if(nm>1){
      while(n<=nm){
       f=f*n;   
       n++;   
      }  
    }
    return "El Factorial del numero "+nm+" es: "+f;
  }
  public String FactorialConFor(int nm){
    int f=1,n=0;
    if(nm>1){
      for(n=1;n<=nm;n++){
       f=f*n;   
      }  
    }
    return "El Factorial del numero "+nm+" es: "+f;
  }
  public String FactorialConDo_While(int nm){
    int f=1,n=1;
    if(nm>1){
      do{
       f=f*n;   
       n++;   
      }  
      while(n<=nm);
    }
    return "El Factorial del numero "+nm+" es: "+f;
  }
  public void GeneraNumeros_sinotros(int num1,int num2){
   for(int nm=1;nm<=10;nm++){
    if((nm==num1) ||(nm==num2))
     continue;
    System.out.println(nm);
   }    
  }
  public String NumeroTextual(int numero){
    String resul="";
    switch(numero){
     case 1:{
      resul="UNO";   
      break;
     }
     case 2:{
      resul="DOS";      
      break;
     }
     case 3:{
      resul="TRES";      
      break;
     }
     case 4:{
      resul="CUATRO";      
      break;
     }
     case 5:{
      resul="CINCO";      
      break;
     }
     case 6:{
      resul="SEIS";      
      break;
     }
     case 7:{
      resul="SIETE";      
      break;
     }
     case 8:{
      resul="OCHO";      
      break;
     }
     case 9:{
      resul="NUEVE";      
      break;
     }
     case 10:{
      resul="DIEZ";      
      break;
     }
    }  
    return resul;
  }
  public void Primeros10(){
   System.out.println("Los Numeros Son: 1,2,3,4,5,6,7,8,9,10");
  }
  public void Primeros10(JLabel lb){
   lb.setText("Los Numeros Son: 1,2,3,4,5,6,7,8,9,10");
  }
  public String ParImpar(int num){
   String rst="El Número es Cero";   
   if(num!=0){
    if(num%2==0)
      rst="El Número "+num+" Es Par";           
    else
      rst="El Número "+num+" Es Impar";     
   }
   return rst;
  }
  public String LosParImpar(int numeros[]){
   String rst="",pares="",impares="";   
   for(int p=0;p<numeros.length;p++){
    if(ParImparbol(numeros[p]) )
      pares=pares+numeros[p];           
    else
      impares=impares+numeros[p];      
   }
   return "Los pares son "+pares+" y los impares "+impares;
  }  
  public String CantidadParesImpares(int numeros[]){
   int pares=0,impares=0;   
   for(int p=0;p<numeros.length;p++){
    if(ParImparbol(numeros[p]) )
      pares++;           
    else
      impares++;      
   }
   return "La cantidad de pares es: "+pares+" y de los impares es: "+impares;
  }
  public boolean ParImparbol(int num){
   boolean rst=false;   
    if(num%2==0)
      rst=true;           
    else
      rst=false;     
   return rst;
  }
  public String GenNumrsapartirdeOtro(int num){
    String rs="",cdax="";int cd=0;
    for(int n=1;n<=num;n++){
     cdax="";   
     for(int c=1;c<=n;c++)
      cdax=cdax+n;  
     cd++;
     if(cd>1)
      rs=rs+";"+cdax;      
     else
      rs=cdax;   
    }
    return rs;
  }
}

