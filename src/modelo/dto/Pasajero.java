/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

/**
 * Clase Pasejora hereda de clas Persona 
 * @author william frasser acevedo
 */
public class Pasajero extends Persona{
    private char genero;
    private int edad;
    /**
       * 
       * @param genero
       * @param edad
       * @param id
       * @param nombre 
    */                          
    public Pasajero(char genero, int edad, int id, String nombre) {
        super(id, nombre);
        this.genero = genero;
        this.edad = edad;
    }
    /**
     * 
     * @return 
     */
    public char getGenero() {
        return genero;
    }
    /**
     * 
     * @param genero 
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    /**
     * 
     * @return 
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Pasajero{" + "genero=" + genero + ", edad=" + edad + '}';
    }
 }
