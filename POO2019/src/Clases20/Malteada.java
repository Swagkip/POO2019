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
public class Malteada {
    private int cantidad;
    private String sabor;
    private String tipoLeche;
    private int noHielos;
    
    public Malteada(int cantidad, String sabor, String tipoLeche, int noHielos)
    {
        this.cantidad=cantidad;
        this.noHielos=noHielos;
        this.sabor=sabor;
        this.tipoLeche=tipoLeche;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipoLeche() {
        return tipoLeche;
    }

    public void setTipoLeche(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    public int getNoHielos() {
        return noHielos;
    }

    public void setNoHielos(int noHielos) {
        this.noHielos = noHielos;
    }
    
    
}
