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
public class Sillon {
    private String tipoDeMadera;
    private float dimensiones;
    private String color;

    public Sillon() {
    }

    public Sillon(String tipoDeMadera, float dimensiones, String color) {
        this.tipoDeMadera = tipoDeMadera;
        this.dimensiones = dimensiones;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeMadera() {
        return tipoDeMadera;
    }

    public void setTipoDeMadera(String tipoDeMadera) {
        this.tipoDeMadera = tipoDeMadera;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    public void sentarse(){
        System.out.println("se sienta xd");
    }
    public void dormir(){
        System.out.println("se duerme");
    }
}
