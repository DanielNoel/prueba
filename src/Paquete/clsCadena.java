/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete;

/**
 *           "mi cadena"
 *             0,1,3,4,5,6,7,8
 * @author User
 */
public class clsCadena {
  clsEvaluador objeva=new clsEvaluador();
    
  public int Cant_Vocales(String cdn){
    int rst=0;char cr;
    for(int i=0;i<cdn.length();i++){
      cr=cdn.toLowerCase().charAt(i);
      if(objeva.EsVocal(cr))
        rst++;  
    }
    return rst;
  }
  public String getVocales(String cdn){
    String rst="";char cr;
    for(int i=0;i<cdn.length();i++){
      cr=cdn.charAt(i);
      if(objeva.EsVocal(cr)){
        if(!objeva.EvaluaLongCadena(rst))
         rst=""+cr;   
        else
          rst=rst+","+cr;     
      }
    }
    return rst;
  }
  public String PrmLetras(String cad){
    String letras=""+cad.charAt(0);
    for(int i=0;i<cad.length();i++){
      if(cad.charAt(i)==' ')
         letras=letras+cad.charAt(i+1);        
    }
    return letras.toUpperCase();
  }
  
}
