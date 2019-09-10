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
public class CuentaNetflix {
    private int pantallas;
    private String usuario;
    private int precio;
    
    public CuentaNetflix(int precio, String usuario, int pantallas){
        this.usuario=usuario;
        this.pantallas=pantallas;
        this.precio=precio;
    }
    
    public void setPantallas(int pa){
        pantallas=pa;
    }
    public int getEdad(){
        return pantallas;
    }
    public void setUsuario(String u){
        usuario=u;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setPrecio(int p){
        precio=p;
    }
    public int getPrecio(){
        return precio;
    }
    
}
