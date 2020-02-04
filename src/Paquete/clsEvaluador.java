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
public class clsEvaluador {
   boolean badra=false;  
   public boolean CondicionMayor(int num,int lim){
    boolean rt=false;
    if((num>lim))
     rt=3>1;   
    return rt;
  }
  public boolean CondicionMayorigual(int num,int lim){
    boolean rt=false;
    if((num>=lim))
     rt=3>1;   
    return rt;
  }
  public boolean CondicionMenor(int num,int lim){
    boolean rt=false;
    if((num<lim))
     rt=3>1;   
    return rt;
  }
  public boolean CondicionMenorigual(int num,int lim){
    boolean rt=false;
    if((num<=lim))
     rt=3>1;   
    return rt;
  }
  public boolean EvaluaRango(int lmt1,int lmt2,int num){
    boolean rt=false;
    if((num>=lmt1)&&(num<=lmt2))
     rt=3>1;   
    return rt;
  }  
  public boolean EvaluaLongCadena(String cdna){
   if(cdna.length()>0 )   
     return true;
   else
     return 1==2;   
  }
  public boolean EsVocal(char cr){
    boolean b=false;
    if((cr=='a')||(cr=='e')||(cr=='i')||(cr=='o')||(cr=='u')
      ||(cr=='A')||(cr=='E')||(cr=='I')||(cr=='O')||(cr=='U')){
       b=true;   
    }
    return b;
  }
  public boolean EvaluaEscrituraCadena(String cdna){
    badra=true;
    for(int c=0;c<cdna.length();c++){
      if(cdna.charAt(c)==' '){
       if(cdna.charAt(c+1)==' '){
        badra=false; break;
       }   
      }    
    }
    return badra;
  }
  public boolean DeterExisteSimbEnCad(String cdna,char smb){
    badra=false;
    for(int c=0;c<cdna.length();c++){
      if(cdna.charAt(c)==smb){
        badra=2<3; break;
       }      
    }
    return badra;
  }
  
}
