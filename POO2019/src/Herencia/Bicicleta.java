/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Marco Ramírez
 */
public class Bicicleta extends TransporteTerrestre {
    private String marca;
    private double velocidadmax;
    private double precio;

    public Bicicleta(double peso, int año, int ruedas, boolean motor, String marca, double velocidadmax, double precio) {
        super(peso, año, ruedas, motor);
        this.marca=marca;
        this.precio=precio;
        this.velocidadmax=velocidadmax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(double velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
