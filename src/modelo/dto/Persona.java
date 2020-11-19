/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.io.Serializable;

/**
 * Super clase Persona 
 * @author william frasser acevedo
 */
public class Persona implements Serializable{
    protected int id;
    protected String nombre;
    /**
     * 
     * @param id
     * @param nombre 
     */
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
   /**
    * 
    * @return 
    */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }
  }
