/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.casa;

/**
 *
 * @author Erick
 */
public class Puerta {
    private String tipoMaterial;
    private float dimensiones;
    private String tipoDePuerta;

    public Puerta() {
    }

    public Puerta(String tipoMaterial, float dimensiones, String tipoDePuerta) {
        this.tipoMaterial = tipoMaterial;
        this.dimensiones = dimensiones;
        this.tipoDePuerta = tipoDePuerta;
    }

    public String getTipoDePuerta() {
        return tipoDePuerta;
    }

    public void setTipoDePuerta(String tipoDePuerta) {
        this.tipoDePuerta = tipoDePuerta;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    public void abrir(){
        System.out.println("Abriendo puerta");
                         
    }
    public void cerrar(){
        System.out.println("cerrando puerta");
    }
}
