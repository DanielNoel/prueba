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
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Controles {
  boolean badra=false;    
  
  public void MarcarTexto(JTextField tx){
    tx.setSelectionStart(0);
    tx.setSelectionEnd(tx.getText().length());
    tx.grabFocus();
  }
  public void LongitudTexto(JTextField tx,int tm,KeyEvent e){
    if(tx.getText().length()==tm)
      e.consume();
  }
  public boolean BuscarEnCombo(JComboBox cb,String dto){
     badra=false; 
    for(int i=0;i<cb.getModel().getSize();i++){
      if(dto.equalsIgnoreCase(cb.getModel().getElementAt(i).toString())){
        badra=true;  
        break;
      }  
    }
    return badra;
  }
  public boolean BscenLista(DefaultListModel mdl,String dto){
    badra=false;  
    for(int i=0;i<mdl.getSize();i++){
      if(dto.equalsIgnoreCase(mdl.getElementAt(i).toString())){
        badra=true;
        break;
      }  
    }
    return badra;
  }
  public void Solonumeros(KeyEvent ev){
    if((ev.getKeyChar()<48)||(ev.getKeyChar()>57))
      ev.consume();
  }
  public void OcultarMostrar(JTextField tx1,JTextField tx2,
                                                  JLabel lb1,JLabel lb2,
                                                boolean bdr){
    tx1.setVisible(bdr);tx2.setVisible(bdr);
    lb1.setVisible(bdr);lb2.setVisible(bdr);
    tx1.setText(null);tx2.setText(null);
    tx1.grabFocus();
  }
  
  public void llenarcbocnNumeros(int cnt,JComboBox cmb){
     cmb.removeAllItems();
    for(int n=1;n<=cnt;n++){
     cmb.addItem(n);
    }  
    cmb.setSelectedIndex(-1);
  }
  
  public void setWidthTableColumn(JTable table, int width, int... indexs) {
        for (int j : indexs) {
            table.getColumnModel().getColumn(j).setWidth(width);
            table.getColumnModel().getColumn(j).setPreferredWidth(width);
        }
    }
  
  public void LimpiarJtable(DefaultTableModel mdltb){
    while(mdltb.getRowCount()>0)  
      mdltb.removeRow(0);
  }
  
  public void SeleccionarprimeroLista(JList lta){
    if(lta.getSelectedIndex()<0)
        lta.grabFocus();
  }
  
  public int SumComoInt_laColumnaJtable(JTable tbl,int column){
   int sum=0;
   if(tbl.getRowCount()>0){
    for(int fil=0;fil<tbl.getRowCount();fil++)
      sum=sum+Integer.parseInt(tbl.getValueAt(fil, column).toString());        
   }
   return sum;
  }
   
  public  boolean BuscardtoenJTable(JTable mytbl,int column,String dto){
    badra=false;
    for(int fil=0;fil<mytbl.getRowCount();fil++){
      if(mytbl.getValueAt(fil, column).toString().equalsIgnoreCase(dto)){
          badra=true;break;
      }    
    }
    return badra;
  }
  public  int BuscardtoenJTabledevPos(JTable mytbl,int column,String dto){
    int pos=-1;
    for(int fil=0;fil<mytbl.getRowCount();fil++){
      if(mytbl.getValueAt(fil, column).toString().equalsIgnoreCase(dto)){
          pos=fil;break;
      }    
    }
    return pos;
  }
  public void VolveralTexto(JTextField tx){
   if(tx.getText().trim().length()==0)
     tx.requestFocus();
  }
  public void VolveralCombo(JComboBox cb){
    if(cb.getSelectedIndex()==-1)  
     cb.grabFocus();
  }
}
