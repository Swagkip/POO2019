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
public class Televisor {
    private int precio;
    private String modelo;
    private int ppi;
    
    public Televisor(int precio,String modelo,int ppi){
        this.precio=precio;
        this.modelo=modelo;
        this.ppi=ppi;
    }
    
    public void setPpi(int d){
        ppi=d;
    }
    public int getEdad(){
        return ppi;
    }
    public void setModelo(String m){
        modelo=m;
    }
    public String getModelo(){
        return modelo;
    }
    public void setPrecio(int p){
        precio=p;
    }
    public int getPatas(){
        return precio;
    }
    
}
