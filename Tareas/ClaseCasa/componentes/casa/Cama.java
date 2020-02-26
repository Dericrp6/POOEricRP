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
public class Cama {
    private String marca;
    private float dimensiones;
    private String tipoDeColchon;

    public Cama() {
    }

    public Cama(String marca, float dimensiones, String tipoDeColchon) {
        this.marca = marca;
        this.dimensiones = dimensiones;
        this.tipoDeColchon = tipoDeColchon;
    }

    public String getTipoDeColchon() {
        return tipoDeColchon;
    }

    public void setTipoDeColchon(String tipoDeColchon) {
        this.tipoDeColchon = tipoDeColchon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    public void acostarse(){
        System.out.println("acostarse");
    }
    public void sentarse(){
        System.out.println("sentarse");
    }
}
