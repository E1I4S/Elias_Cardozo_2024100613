/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea8_herencia;

/**
 *
 * @author usuario
 */
public class Persona {
protected String nombre;
protected String cedula; 

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        
    }
@Override
public String toString(){
    return super.toString() + "| Nombre: " + nombre + "| Cedula: " + cedula;
 
 }    
}



