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
public class Programa {
    private int actores;
    private String localizacion;
    private String nombre;
    private int presupuesto;
    
    public Programa(int actores, String localizacion, String nombre, int presupuesto)
    {
        this.actores=actores;
        this.localizacion=localizacion;
        this.nombre=nombre;
        this.presupuesto=presupuesto;
    }

    public int getActores() {
        return actores;
    }

    public void setActores(int a) {
        actores = a;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String l) {
        localizacion = l;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int p) {
        presupuesto = p;
    }
    
}
