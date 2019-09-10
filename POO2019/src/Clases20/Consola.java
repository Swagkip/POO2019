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
public class Consola {
    private int precio;
    private String marca;
    private int juegos;
    
    public Consola(int precio,String marca,int juegos){
        this.precio=precio;
        this.marca=marca;
        this.juegos=juegos;
    }
    
    public void setJuegos(int j){
        juegos=j;
    }
    public int getEdad(){
        return juegos;
    }
    public void setRaza(String m){
        marca=m;
    }
    public String getRaza(){
        return marca;
    }
    public void setPrecio(int p){
        precio=p;
    }
    public int getPrecio(){
        return precio;
    }
    
}