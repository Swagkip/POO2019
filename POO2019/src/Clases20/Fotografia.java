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
public class Fotografia {
    
    private double largo;
    private double ancho;
    private int precio;
    private String formato;

public Fotografia(double largo, double ancho, int precio, String formato)
{
this.largo=largo;
this.ancho=ancho;
this.largo=largo;
this.precio=precio;

}

    public double getLargo() {
        return largo;
    }

    public void setLargo(double l) {
        largo = l;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double an) {
        ancho = an;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int p) {
        precio = p;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String f) {
        formato = f;
    }


}
