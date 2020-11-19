/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.dto.Pasajero;

/**
 * Clase PasajeroDao es el modelo del modulo Pasajero
 * De clara una instancia dinamica de la clase Pasajero
 * implementa los médotos para adicionar instancias de clase Pasajero a la lista de pasajeros
 * Impelmenta un módulo para consultar un pasajero
 * Implementa un módulo que retorna una instancia de la lista de pasajeros. 
 * @author william Frasser Acevedo
 */
public class PasajeroDao {
    private static ArrayList<Pasajero> listaPasajero =new ArrayList();
    /**
     * 
    */
    public PasajeroDao() {
        this.listaPasajero =new ArrayList();
    }
    /**
     * Método que permite adicionar objetos o instancias de la clase pasajero a la lista.
     * @param pasajero es una instancia de la clase Pasajero
     * @return true si se adiciono la instancia a la lista y false si no se adiciono.
     */
    public static boolean registrar(Pasajero pasajero){
       return listaPasajero.add(pasajero);
       
    }
    /**
     * Método para consultar un pasajero
     * @param id identificación del pasajero
     * @return una instancia de la clase 
     */
    public static Pasajero consultar(int id){
        Pasajero p = null;
        for (Pasajero pasajero : listaPasajero) {
            if (pasajero.getId()==id) {
                p = pasajero;
                break;
            }
        }
        return p;
    }
    /**
     * 
     * @return la instancia de la lista de pasajeros 
     */
    public static ArrayList<Pasajero> consultarTodos(){
        return listaPasajero;
    } 
    
}
