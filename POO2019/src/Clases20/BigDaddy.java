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
public class BigDaddy {
    private String nombre;
    private int hp;
    private int eve;
    private int noarmas;
    
    private BigDaddy(String nombre, int eve, int hp, int noarmas)
    {
        this.eve=eve;
        this.hp=hp;
        this.noarmas=noarmas;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEve() {
        return eve;
    }

    public void setEve(int eve) {
        this.eve = eve;
    }

    public int getNoarmas() {
        return noarmas;
    }

    public void setNoarmas(int noarmas) {
        this.noarmas = noarmas;
    }
    
    
}
