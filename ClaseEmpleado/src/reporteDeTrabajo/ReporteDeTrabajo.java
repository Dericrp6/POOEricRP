/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporteDeTrabajo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Erick
 */
public class ReporteDeTrabajo {
    
    public static void main(String[] args) { //psvm para crear main
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new Empleado("José García Pérez", "sistemas", 670, 30, 5));
        empleados.add(new Empleado("Diana Herrera Pérez", "recursos humanos", 450, 25, 0));
        empleados.add(new Empleado("Jessica Juarez Días", "ventas", 400, 28, 0));
        empleados.add(new Empleado("Pedro Paz Orozco", "ventas", 410, 30, 0));
        empleados.add(new Empleado("José Marcel Pérez", "sistemas", 680, 29, 6));
        empleados.add(new Empleado("Jesús Días García", "recursos humanos", 455, 30, 0));
        empleados.add(new Empleado("Pedro Xotla Ramirez", "sistemas", 675, 27, 0));
        empleados.add(new Empleado("Javier Medina Blanco", "ventas", 400, 30, 4));
        empleados.add(new Empleado("Elizabeth Villa Sosa", "sistemas", 670, 30, 3));
        
        Iterator<Empleado> iter = empleados.iterator();
        int total = 0;
        while (iter.hasNext()) {
            Empleado empleado = iter.next();
            System.out.println("Sueldo mensual de " + empleado.getNombre() + ": " + (empleado.getSueldoDiario()* empleado.getDiasTrabajados()) + " pesos mexicanos.");
            total += empleado.getSueldoDiario()* empleado.getDiasTrabajados();
            System.out.println("Monto de horas extra de " + empleado.getNombre() + ": " + (empleado.getHorasExtra()* 85) + " pesos mexicanos.");
            total += empleado.getHorasExtra()* 85;
            System.out.println();
        }
        System.out.println("Suma de todos los sueldos incluyendo horas extra: " + total + " pesos mexicanos.");
        System.out.println();
        
        Iterator<Empleado> iter2 = empleados.iterator();
        int menosDiasTrabajados = 31;
        String trabajadorConMenosDias = "";
        while (iter2.hasNext()) {
            Empleado empleado = iter2.next();
            if (empleado.getDiasTrabajados() < menosDiasTrabajados){
                menosDiasTrabajados = empleado.getDiasTrabajados();
                trabajadorConMenosDias = empleado.getNombre();
            }
        }
        System.out.println("El empleado que trabajó menos días en el mes es: " + trabajadorConMenosDias);
        System.out.println();
        
        Iterator<Empleado> iter3 = empleados.iterator();
        int masHorasExtra = 0;
        String trabajadorConMasHoras = "";
        while (iter3.hasNext()) {
            Empleado empleado = iter3.next();
            if (empleado.getHorasExtra()> masHorasExtra){
                masHorasExtra = empleado.getHorasExtra();
                trabajadorConMasHoras = empleado.getNombre();
            }
        }
        System.out.println("Empleado con más horas extras: " + trabajadorConMasHoras);
    }
}
