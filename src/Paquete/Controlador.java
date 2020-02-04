/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import com.toedter.calendar.JDateChooser;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.text.JTextComponent;

/**
 *
 * @author User
 */
public class Controlador {

    public Controles objControles = new Controles();
    public clsNumero objnumeros = new clsNumero();
    public clsCadena objCadena = new clsCadena();
    public clsEvaluador objEvaluador = new clsEvaluador();
    private DefaultListModel modeloLista = new DefaultListModel();
    public String[] Data = new String[20];
    public int Fila = 0;
    public Conexion Base = new Conexion();
    public String Sql = "";
    public int Veces = 0;
    public boolean bandera = false;
    public IMPRIMIR impresor=new IMPRIMIR();

    public static int infopase = -1;

    public ResultSet DevolverRegistro(String sq) {
        try {
            Base.st = Base.cnx.createStatement();
            Base.rs = Base.st.executeQuery(sq);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Base.rs;
    }

    public double CalculamontoenJtable(JTable tbla, int column) {
        double mto = 0.00;
        for (int f = 0; f < tbla.getRowCount(); f++) {
            mto = mto + Double.parseDouble(tbla.getValueAt(f, column).toString());
        }
        return mto;
    }

    public void PonerFechaenDateChooser(JDateChooser fecha, String fec) {
        ((JTextComponent) fecha.getDateEditor().getUiComponent()).setText(fec);
    }

    public String Formato_Amd(java.util.Date v1) {
        java.util.Date fecha1 = v1;
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String fecha = df.format(fecha1);
        return fecha;
    }

    public String Formato_DMA(java.util.Date v1) {
        java.util.Date fecha1 = v1;
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy");
        String fecha = df.format(fecha1);

        return fecha;
    }

    public void LimTabla(Mimodelo mdl) {
        while (mdl.getRowCount() > 0) {
            mdl.removeRow(0);
        }
    }

    public void hideTableColumn(JTable table, int... indexs) {
        for (int j : indexs) {

            table.getColumnModel().getColumn(j).setMinWidth(0);
            table.getColumnModel().getColumn(j).setPreferredWidth(0);
            table.getColumnModel().getColumn(j).setWidth(0);
            table.getColumnModel().getColumn(j).setMaxWidth(-1);
        }
    }

    public void LlenarJTabla(Mimodelo mdl, String sq, int cdt) {
        LimTabla(mdl);
        try {
            Base.st = Base.cnx.createStatement();
            Base.rs = Base.st.executeQuery(sq);
            while (Base.rs.next()) {
                for (Veces = 1; Veces <= cdt; Veces++) {
                    Data[Veces - 1] = Base.rs.getString(Veces);
                }
                mdl.addRow(Data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LlenarCombo(JComboBox cbo, String Consulta, int pos) {
        cbo.removeAllItems();
        try {
            Base.rs = DevolverRegistro(Consulta);
            while (Base.rs.next()) {
                cbo.addItem(Base.rs.getString(pos));
            }
            cbo.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void llenarList(String sq, String nomcampo, JList lista) {
        try {
            Base.st = Base.cnx.createStatement();
            Base.rs = Base.st.executeQuery(sq);
            // ResultSet rs = con.consutaLista();//La consulta tiene que devolver un ResultSet para tratar los datos
            while (Base.rs.next()) {
                modeloLista.addElement(Base.rs.getString(nomcampo));//nombre es el campo de la base de datos
            }
            lista.setModel(modeloLista);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void CrearRegistro(String sq) {
        try {
            Base.st = Base.cnx.createStatement();
            Base.st.executeUpdate(sq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EditarRegistro(String sql) {
        try {
            Base.st = Base.cnx.createStatement();
            Base.st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String DevolverRegistroDto(String sq, int pos) {
        String rs = "";
        try {
            Base.st = Base.cnx.createStatement();
            Base.rs = Base.st.executeQuery(sq);
            if (Base.rs.next()) {
                rs = Base.rs.getString(pos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void MostrarEnCombo(String vl, JComboBox cbo) {
        int p = 0, ct = 0;
        while (ct < cbo.getItemCount()) {
            if (cbo.getModel().getElementAt(ct).toString().toUpperCase().compareTo(
                    vl.toUpperCase()) == 0) {
                p = ct;
                ct = cbo.getItemCount();
            }
            ct++;
        }
        cbo.setSelectedIndex(p);
    }

    public String EliminarRegistro(String sql) {
        String cd = "Registro Eliminado";
        try {
            Base.st = Base.cnx.createStatement();
            Base.st.executeUpdate(sql);
            Base.rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cd;
    }

    public boolean Verificarconsulta(String sql) {
        boolean bd = false;
        try {
            Base.st = Base.cnx.createStatement();
            Base.rs = Base.st.executeQuery(sql);
            bd = Base.rs.next();
        } catch (Exception e) {
        }
        return bd;
    }

    public void mostrar(JDesktopPane desk, JInternalFrame jIf) {
        desk.removeAll();
        desk.updateUI();
        desk.add(jIf, JLayeredPane.DEFAULT_LAYER);
        jIf.setVisible(true);
    }

    public void decimal(KeyEvent e, String text) {
        int count = 0;
        if (text.length() == 0 && e.getKeyChar() == '.') {
            e.consume();
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '.') {
                    count++;
                    break;
                }
            }
            if (((e.getKeyChar() < 48) || (e.getKeyChar() > 57))
                    && (e.getKeyChar() != 8 && e.getKeyCode() != 37 && e.getKeyCode() != 39
                    && e.getKeyCode() != 127 && e.getKeyChar() != '.')) {
                e.consume();
            } else {
                if ((count > 0 && e.getKeyChar() == '.')) {
                    e.consume();
                }
            }
        }
    }

    public double RedondearNumero(double numero, int digitos) {
        int cifras = (int) Math.pow(10, digitos);
        return Math.rint(numero * cifras) / cifras;
    }

}
