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
public class Pokemon {
    private String tipo1;
    private String tipo2;
    private int hp;
    private int fase;
    private String nombre;
    
    public Pokemon(String tipo1,String tipo2, int hp, int fase, String nombre)
    {
        this.fase=fase;
        this.hp=hp;
        this.nombre=nombre;
        this.tipo1=tipo1;
        this.tipo2=tipo2;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
