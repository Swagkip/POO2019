/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases20;

/**
 *
 * @author Marco Ramírez
 */public class Silla {
    private int patas;
    private String material;
    private int precio;
    
    public Silla(int patas,String material,int precio){
        this.patas=patas;
        this.material=material;
        this.precio=precio;
    }
    
    public void setEdad(int pr){
        precio=pr;
    }
    public int getEdad(){
        return precio;
    }
    public void setMaterial(String m){
        material=m;

    }
    public String getMaterial(){
        return material;
    }
    public void setPatas(int p){
        patas=p;
    }
    public int getPatas(){
        return patas;
    }
    
}
