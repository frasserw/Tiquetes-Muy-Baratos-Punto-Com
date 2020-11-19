/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.dao.PasajeroDao;
import modelo.dto.Pasajero;
import vista.VistaConsultaTodosPasajeros;

/**
 *
 * @author william frasser acevedo
 */
public class ControlConsultaTodosPasajeros implements ActionListener{
    private VistaConsultaTodosPasajeros vista;
    private DefaultTableModel tablaPas;
    /**
     * 
     * @param vista 
     */
    public ControlConsultaTodosPasajeros(VistaConsultaTodosPasajeros vista){
        this.vista = vista;
        this.vista.consultaTodos.addActionListener(this);
        this.tablaPas = (DefaultTableModel) this.vista.tablaconsultaPas.getModel();
        this.vista.setVisible(true);
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.consultaTodos)) {
            ArrayList<Pasajero> listaPasjeros = PasajeroDao.consultarTodos();
              
            int filas = tablaPas.getRowCount();
            for (int i = 0; i < filas; i++) {
                tablaPas.removeRow(0);
            }
            
            
            for (Pasajero pasajero : listaPasjeros) {
                Object fila[] = {pasajero.getId(),pasajero.getNombre(),pasajero.getGenero(),pasajero.getEdad()};
                tablaPas.addRow(fila);
            }
              
            
        }
    }
    
}




















