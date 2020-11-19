/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.PasajeroDao;
import modelo.dto.Pasajero;
import vista.VistaPasajero;

/**
 *
 * @author william frasser acevedo 
 */
public class ControlPasajero implements ActionListener{
    private VistaPasajero vista;
        
    public ControlPasajero(VistaPasajero vista){
        this.vista = vista;
        this.vista.registrar.addActionListener(this);
        this.vista.consultar.addActionListener(this);
        this.vista.setVisible(true);
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * 
         */
        if (e.getSource().equals(this.vista.registrar)) {
            
            int id = Integer.valueOf(this.vista.id.getText().toString());
            String nombre = this.vista.nombrePasajero.getText().toString();
            char genero = this.vista.genero1.getText().toString().charAt(0);
            int edad = Integer.valueOf(this.vista.edad.getText().toString());
            
            Pasajero pasajero =new Pasajero(genero,edad,id,nombre);
            
            if(PasajeroDao.registrar(pasajero)){
                JOptionPane.showMessageDialog(null, "Un Nuevo Pasajero se ha Registrado");
            }else{
                JOptionPane.showMessageDialog(null, "Error no se Registro el Pasajero");
            }
           
            this.vista.id.setText("");
            this.vista.nombrePasajero.setText("");
            
       }
       /**
        * 
        */   
       if (e.getSource().equals(this.vista.consultar)) {
            int id = Integer.valueOf(this.vista.id.getText().toString());
            Pasajero pasajero = PasajeroDao.consultar(id);
            
            if(pasajero != null){
                this.vista.nombrePasajero.setText(pasajero.getNombre());
                this.vista.genero1.setText(String.valueOf(pasajero.getGenero()));
                this.vista.edad.setText(String.valueOf(pasajero.getEdad()));
                
            }else{
                JOptionPane.showMessageDialog(null, "Error Pasajero no Encontrado");
            }
       }
       
    }
   
}



















