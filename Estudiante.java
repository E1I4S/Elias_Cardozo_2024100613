/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea8_herencia;

/**
 *
 * @author usuario
 */
public class Estudiante extends Persona {
private final String matricula;
private final String carrera;

public Estudiante(String nombre, String cedula, String matricula,String carrera){
super(nombre, cedula);
this.matricula = matricula;
this.carrera = carrera;
}

@Override
public String toString(){
    return super.toString() + "| Matricula: " + matricula + "| Carrera: " + carrera;
}

public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("Antonio", "5736321", "2024101456", "Ing. Electronica");
    
    System.out.println(estudiante1);
    }
    
}