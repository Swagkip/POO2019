/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases20;

/**
 *
 * @author Marco Ramírez
 */
public class Abuelito {
    private int edad;
    private boolean enfermedad;
    private double peso;
    private int nohijos;
    private String nombre;
    
    public Abuelito(int edad, boolean enfermedad, double peso, int nohijos, String nombre)
    {
        this.edad=edad;
        this.enfermedad=enfermedad;
        this.nohijos=nohijos;
        this.nombre=nombre;
        this.peso=peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNohijos() {
        return nohijos;
    }

    public void setNohijos(int nohijos) {
        this.nohijos = nohijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
