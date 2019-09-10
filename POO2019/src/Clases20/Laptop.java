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
public class Laptop {
    private String modelo;
    private String marca;
    private String procesador;
    private int ram;
    
    public Laptop(String modelo, String marca, String procesador, int ram)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.procesador=procesador;
        this.ram=ram;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String p) {
        procesador = p;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int r) {
        ram = r;
    }
    
    
}
