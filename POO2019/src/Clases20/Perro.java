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
public class Perro {
    private int edad;
    private String raza;
    private int patas;
    
    public Perro(int edad,String raza,int patas){
        this.edad=edad;
        this.raza=raza;
        this.patas=patas;
    }
    
    public void setEdad(int e){
        edad=e;
    }
    public int getEdad(){
        return edad;
    }
    public void setRaza(String r){
        raza=r;
    }
    public String getRaza(){
        return raza;
    }
    public void setPatas(int p){
        patas=p;
    }
    public int getPatas(){
        return patas;
    }
    
}
