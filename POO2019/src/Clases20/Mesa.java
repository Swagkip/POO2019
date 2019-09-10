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
public class Mesa {
    private int largo;
    private int ancho;
    private String material;
    private int patas;
    
public Mesa(int largo, int ancho, String material, int patas)
{
    this.ancho=ancho;
    this.largo=largo;
    this.material=material;
    this.patas=patas;
}

    public int getLargo() {
        return largo;
    }

    public void setLargo(int l) {
        largo = l;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int a) {
        ancho = a;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String m) {
        material = m;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int p) {
        patas = p;
    }

    
}
