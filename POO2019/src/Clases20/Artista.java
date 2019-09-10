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
public class Artista {
    private int edad;
    private String nombreArtistico;
    private int nodiscos;
    private String disquera;
    
    public Artista (int edad, String nombreArtistico,int nodiscos, String disquera)
    {
        this.edad=edad;
        this.disquera=disquera;
        this.nombreArtistico=nombreArtistico;
        this.nodiscos=nodiscos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad=e;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String A) {
        nombreArtistico = A;
    }

    public int getNodiscos() {
        return nodiscos;
    }

    public void setNodiscos(int dis) {
        nodiscos = dis;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String dis) {
        disquera = dis;
    }
    
    
    
}
