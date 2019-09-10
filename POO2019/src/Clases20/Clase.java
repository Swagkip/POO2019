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
public class Clase {
    private String docente;
    private int minutos;
    private String nombre;
    private int alumnos;
    
    public Clase(String docente, int minutos, String nombre, int alumnos)
            
    {
       this.alumnos=alumnos;
       this.docente=docente;
       this.minutos=minutos;
       this.nombre=nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }
    
}
