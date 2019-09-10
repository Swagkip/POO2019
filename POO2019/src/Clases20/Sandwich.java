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
public class Sandwich {
    private String nombre;
    private String pan;
    private String jamon;
    private String queso;
    private int capas;
    
    public Sandwich(String nombre, String pan, String jamon, String queso, int capas)
    {
        this.capas=capas;
        this.jamon=jamon;
        this.nombre=nombre;
        this.pan=pan;
        this.queso=queso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getJamon() {
        return jamon;
    }

    public void setJamon(String jamon) {
        this.jamon = jamon;
    }

    public String getQueso() {
        return queso;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public int getCapas() {
        return capas;
    }

    public void setCapas(int capas) {
        this.capas = capas;
    }
    
    
}
