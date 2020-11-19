/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlodar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaConsultaTodosPasajeros;
import vista.VistaPasajero;
import vista.VistaPrincipal;

/**
 * Clase conrrolador principal
 * @author william frasser acevedo
 */
public class ControlPrincipal implements ActionListener{
    private VistaPrincipal vistaP;
    /**
     * 
     * @param vistaP 
     */
    public ControlPrincipal(VistaPrincipal vistaP){
        this.vistaP = vistaP;
        this.vistaP.mPasajero.addActionListener(this);
        this.vistaP.mPiloto.addActionListener(this);
        this.vistaP.mCPasajero.addActionListener(this);
        this.vistaP.mSalir.addActionListener(this);
        
        this.vistaP.setVisible(true);
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vistaP.mPasajero)) {
            ControlPasajero controlP =new ControlPasajero(new VistaPasajero());
        }
        
        if(e.getSource().equals(this.vistaP.mPiloto)){
           
        }
        
        if(e.getSource().equals(this.vistaP.mVuelo)){
        
        }
        
        if (e.getSource().equals(this.vistaP.mSalir)) {
            System.exit(0);
        }
        //
        if (e.getSource().equals(this.vistaP.mCPasajero)) {
            ControlConsultaTodosPasajeros controlPas =new ControlConsultaTodosPasajeros(new VistaConsultaTodosPasajeros());
        }
        
        
    
    }
    
}
