/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiquetesmuy;

import controlodar.ControlPrincipal;
import vista.VistaPasajero;
import vista.VistaPrincipal;

/**
 * Programa que permite la entrada a el controlador principal que es la interface que permite el acceso atodos los modulos d el aplicación. 
 * @author william frasser acevedo
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControlPrincipal control =new ControlPrincipal(new VistaPrincipal());
        
    }
    
}
