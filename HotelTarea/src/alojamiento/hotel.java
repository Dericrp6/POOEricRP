package alojamiento;

import componentes.Reservacion;
import componentes.TipoHabitacion;
import componentes.TipoVista;
import java.util.ArrayList;
import java.util.Scanner;
import utilidades.Util;

public class Hotel {
    private String nombre;
    private String ubicacion;
    private ArrayList<Reservacion> reservaciones = Reservacion.crearListaReservaciones();

    public Hotel(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public ArrayList<Reservacion> getReservaciones() {
        return reservaciones;
    }
    
    public void setReservaciones(ArrayList<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }
    
    public void mostrarMenu() {
        int salir = 0;
        do {
            System.out.println("BIENVENIDOS A " + getNombre().toUpperCase());
            System.out.println("");
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Reservar habitación");
            System.out.println("2. Mostrar reservación");
            System.out.println("3. Actualizar información");
            System.out.println("4. Finalizar estancia");
            System.out.println("0. Exit");
            
            //Leer la respuesta del usuario
            int respuesta = Util.validarRespuesta(0, 4);
            
            switch (respuesta) {
                case 0:
                    salir = 0;
                    break;
                case 1:
                    reservarHabitacion();
                    break;
                case 2:
                    mostrarReservaciones();
                    break;
                case 3:
                    actualizarInformacion();
                    break;
                case 4:
                    finalizarEstancia();
                    break;
                default:
                    System.out.println();
                    System.out.println("....¡¡Selecciona una opción!!....");
                    System.out.println();
                    salir = 1;
                    break;
            }
        }while(salir != 0);
    }
    
    public void reservarHabitacion() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println(":: INGRESAR DATOS ::");
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa tu nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("Deseas incluir todos los servicios: ");
            System.out.println("1. Si");
            System.out.println("2. No");
            int respuesta = Util.validarRespuesta(1, 2);
            boolean todoIncluido = false;
            switch (respuesta) {
                case 1:
                    todoIncluido = true;
                    break;
                case 2:
                    todoIncluido = false;
                    break;
            }
            TipoHabitacion habitacion = TipoHabitacion.sencilla;
            System.out.println("Selecciona tu habitación: ");
            if (todoIncluido) {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Util.validarRespuesta(1, 5);
                
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencillaTi;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.dobleTi;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suiteTi;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.kingTi;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencialTi;
                        break;
                }
            } else {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Util.validarRespuesta(1, 5);
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencilla;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.doble;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suite;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.king;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencial;
                        break;
                }
            }
            
            System.out.println("Escoja la vista deseada: ");
            System.out.println("1. Al mar");
            System.out.println("2. Al campo de golf");
            respuesta = Util.validarRespuesta(1, 2);
            TipoVista vista = TipoVista.mar;
            switch (respuesta) {
                case 1:
                    vista = TipoVista.mar;
                    break;
                case 2:
                    vista = TipoVista.golf;
                    break;
            }
            
            System.out.println("Ingrese el número de su hora de entrada (entre 3 pm y 12 pm): ");
            respuesta = Util.validarRespuesta(3, 12);
            int horaEntrada = respuesta;
            System.out.println("Ingrese el número de su hora de salida (entre 3 pm y 12 pm): ");
            respuesta = Util.validarRespuesta(3, 12);
            int horaSalida = respuesta;
            
            reservaciones.add(new Reservacion(nombre, todoIncluido, habitacion, vista, horaEntrada, horaSalida));
            
            System.out.println();
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + reservaciones.get(i).getHuesped());
            }
            System.out.println();
            System.out.println("La habitación ha quedado reservada.");
            System.out.println();
            
            //Regresar al menu anterior
            respuesta = 0;
            
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
        }while(salir !=0);
    }
    
    public void mostrarReservaciones() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println(":: RESERVACIONES ::");
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + reservaciones.get(i).getHuesped());
            }
            
            System.out.println("0. Regresar al Menú");
            System.out.println();
            
            //Leer Respuesta usuario
            int respuesta = Util.validarRespuesta(0, reservaciones.size());
            
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
            if (respuesta > 0) {
                Reservacion reservacionSeleccionada = reservaciones.get(respuesta-1);
                System.out.println();
                System.out.println(reservacionSeleccionada);
            }
        }while(salir !=0);
    }
    
    public void actualizarInformacion() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println(":: ACTUALIZAR DATOS ::");
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + reservaciones.get(i).getHuesped());
            }
            
            System.out.println("0. Regresar al Menú");
            System.out.println();
            
            //Leer Respuesta usuario
            int respuesta = Util.validarRespuesta(0, reservaciones.size());
            Reservacion reservacionSeleccionada = reservaciones.get(respuesta-1);
            System.out.println();
            
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa tu nombre: ");
            String nombre = teclado.nextLine();
            reservacionSeleccionada.setHuesped(nombre);
            
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("Deseas incluir todos los servicios: ");
            System.out.println("1. Si");
            System.out.println("2. No");
            respuesta = Util.validarRespuesta(1, 2);
            boolean todoIncluido = false;
            switch (respuesta) {
                case 1:
                    todoIncluido = true;
                    break;
                case 2:
                    todoIncluido = false;
                    break;
            }
            reservacionSeleccionada.setTodoIncluido(todoIncluido);
            
            TipoHabitacion habitacion = TipoHabitacion.sencilla;
            System.out.println("Selecciona tu habitación: ");
            if (todoIncluido) {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Util.validarRespuesta(1, 5);
                
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencillaTi;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.dobleTi;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suiteTi;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.kingTi;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencialTi;
                        break;
                }
            } else {
                System.out.println("1. Sencilla");
                System.out.println("2. Doble");
                System.out.println("3. Suite");
                System.out.println("4. King");
                System.out.println("5. Presidencial");
                respuesta = Util.validarRespuesta(1, 5);
                switch (respuesta) {
                    case 1:
                        habitacion = TipoHabitacion.sencilla;
                        break;
                    case 2:
                        habitacion = TipoHabitacion.doble;
                        break;
                    case 3:
                        habitacion = TipoHabitacion.suite;
                        break;
                    case 4:
                        habitacion = TipoHabitacion.king;
                        break;
                    case 5:
                        habitacion = TipoHabitacion.presidencial;
                        break;
                }
            }
            reservacionSeleccionada.setTipoDeHabitacion(habitacion);
            
            System.out.println("Escoja la vista deseada: ");
            System.out.println("1. Al mar");
            System.out.println("2. Al campo de golf");
            respuesta = Util.validarRespuesta(1, 2);
            TipoVista vista = TipoVista.mar;
            switch (respuesta) {
                case 1:
                    vista = TipoVista.mar;
                    break;
                case 2:
                    vista = TipoVista.golf;
                    break;
            }
            reservacionSeleccionada.setTipoDeVista(vista);
            
            System.out.println("Ingrese el número de su hora de entrada (entre 3 pm y 12 pm): ");
            respuesta = Util.validarRespuesta(3, 12);
            reservacionSeleccionada.setHoraDeEntrada(respuesta);
            
            System.out.println("Ingrese el número de su hora de salida (entre 3 pm y 12 pm): ");
            respuesta = Util.validarRespuesta(3, 12);
            reservacionSeleccionada.setHoraDeSalida(respuesta);
            
            System.out.println();
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + reservaciones.get(i).getHuesped());
            }
            System.out.println();
            System.out.println("La reservación ha sido actualizada.");
            System.out.println();
            
            respuesta = 0;
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
        }while(salir !=0);
    }
    
    public void finalizarEstancia() {
        int salir = 1;
        
        do {
            System.out.println();
            System.out.println(":: REGISTRAR SALIDA ::");
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + reservaciones.get(i).getHuesped());
            }
            
            System.out.println("0. Regresar al Menú");
            System.out.println();
            
            //Leer Respuesta usuario
            int respuesta = Util.validarRespuesta(0, reservaciones.size());
            Reservacion reservacionSeleccionada = reservaciones.get(respuesta-1);
            reservaciones.remove(reservacionSeleccionada);
            System.out.println();
            
            for (int i = 0; i < reservaciones.size(); i++) {
                System.out.println(i+1 + ". " + reservaciones.get(i).getHuesped());
            }
            System.out.println();
            System.out.println("La reservación ha sido finalizada.");
            System.out.println();
            
            respuesta = 0;
            if(respuesta == 0) {
                salir = 0;
                mostrarMenu();
                break;
            }
        }while(salir !=0);
    }
}