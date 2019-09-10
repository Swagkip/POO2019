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
public class TransporteTerrestre extends MedioTrasporte {
    private int ruedas;
    private boolean motor;
    
    /**
     *
     * @param peso
     * @param anio
     * @param ruedas
     * @param motor
     */
    public TransporteTerrestre(double peso, int anio, int ruedas, boolean motor)
    {
        super();
        this.motor=motor;
        this.ruedas=ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
    
}
