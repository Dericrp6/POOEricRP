package componentes;

public enum TipoHabitacion {
    sencilla("Sencilla(cama matrimonial)", 1600),
    sencillaTi("Sencilla(cama matrimonial)", 2200),
    doble("Doble(dos camas matrimoniales)", 2650),
    dobleTi("Doble(dos camas matrimoniales)", 3650),
    suite("Suite(mini bar, jacuzzi, cama King size)", 4890),
    suiteTi("Suite(mini bar, jacuzzi, cama King size)", 5950),
    king("King(sala, mini bar, alberca, cama King size)", 6250),
    kingTi("King(sala, mini bar, alberca, cama King size)", 7850),
    presidencial("Presidencial(recibidor, sala, bar, alberca, dos camas King size)", 8100),
    presidencialTi("Presidencial(recibidor, sala, bar, alberca, dos camas King size)", 9950);
    
    private final String descripcion;
    private final int precio;

    private TipoHabitacion(String descripcion, int precio) {
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
        // TODO Auto-generated method stub
        return  getDescripcion();
    }
}