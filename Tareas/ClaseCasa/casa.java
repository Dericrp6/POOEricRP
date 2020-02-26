
import componentes.casa.Cama;
import componentes.casa.Puerta;
import componentes.casa.Sillon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class casa {
    private int Puerta;
    private int Cama;
    private int Sillon;

    public casa() {
    }

    public casa(int Puerta, int Cama, int Sillon) {
        this.Puerta = Puerta;
        this.Cama = Cama;
        this.Sillon = Sillon;
    }

    public int getSillon() {
        return Sillon;
    }

    public void setSillon(int Sillon) {
        this.Sillon = Sillon;
    }

    public int getPuerta() {
        return Puerta;
    }

    public void setPuerta(int Puerta) {
        this.Puerta = Puerta;
    }

    public int getCama() {
        return Cama;
    }

    public void setCama(int Cama) {
        this.Cama = Cama;
    }
    
    
}
