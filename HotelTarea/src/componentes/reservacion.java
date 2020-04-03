package componentes;

import java.util.ArrayList;

public class Reservacion {
    private String huesped;
    private boolean todoIncluido;
    private TipoHabitacion tipoDeHabitacion;
    private TipoVista tipoDeVista;
    private int horaDeEntrada;
    private int horaDeSalida;
    private int cuenta;
    
    public Reservacion(String huesped) {
        this.huesped = huesped;
    }
    
    public Reservacion(String huesped, boolean todoIncluido, TipoHabitacion tipoDeHabitacion, TipoVista tipoDeVista, int horaDeEntrada, int horaDeSalida) {
        this.huesped = huesped;
        this.todoIncluido = todoIncluido;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.tipoDeVista = tipoDeVista;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
    }
    
    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public boolean isTodoIncluido() {
        return todoIncluido;
    }

    public void setTodoIncluido(boolean todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

    public TipoHabitacion getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(TipoHabitacion tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public TipoVista getTipoDeVista() {
        return tipoDeVista;
    }

    public void setTipoDeVista(TipoVista tipoDeVista) {
        this.tipoDeVista = tipoDeVista;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public int getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        String textoTodoIncluido = "";
        if (isTodoIncluido()) {
            textoTodoIncluido += "Con todo incluido (servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectaculos dentro del hotel, pulsera para barra libre 24 hrs)";
        } else {
            textoTodoIncluido += "Sin ningún servicio incluido";
        }
        
        int cuenta = 0;
        cuenta += getTipoDeVista().getPrecio();
        cuenta += getTipoDeHabitacion().getPrecio();
        setCuenta(cuenta);
        
        return  "\n :: DETALLES ::" +
                "\n Huesped: " + getHuesped() + 
                "\n Hora de entrada: " + getHoraDeEntrada() + " pm" +
                "\n Hora de salida: " + getHoraDeSalida() + " pm" +
                "\n Habitación: " + getTipoDeHabitacion() +
                "\n Vista: " + getTipoDeVista() +
                "\n " + textoTodoIncluido +
                "\n SPA, transporte y propinas no incluidas." +
                "\n Tarifa por noche: " + getCuenta();
    }
    
    public static ArrayList<Reservacion> crearListaReservaciones() {
        ArrayList<Reservacion> reservaciones = new ArrayList();
        
        for (int i = 1; i <= 3; i++) {
            reservaciones.add(new Reservacion("Huesped de prueba " + i));
        }
        return reservaciones;
    }
}