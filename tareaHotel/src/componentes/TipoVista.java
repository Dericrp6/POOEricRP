/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author Erick
 */
public enum TipoVista {
    mar("Al mar", 350),
    golf("Al campo de golf", 200);
    
    private final String descripcion;
    private final int precio;

    private TipoVista(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
    
    @Override
    public String toString() {
        return  getDescripcion();
    }
}
