    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.tg2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aula
 */
public class Empresa {
    static ArrayList<Empleado> empleados;
    static Scanner lea = new Scanner(System.in);
    
    private static Empleado buscar(int cod){
        for(Empleado e : empleados){
            if(e.getCodigo() == cod)
                return e;
        }
        return null;
    }
    
    public static void agregarEmpleado(int cod, String nom, String ti){
        if(buscar(cod) == null){
            double salario = lea.nextDouble();
            
            if(ti.equals("NORMAL"))
                empleados.add( new Empleado(cod, nom, salario) );
            else if(ti.equals("TEMPORAL"))
                empleados.add(new EmpleadoTemporal(cod, nom, salario));
            else
                empleados.add(new EmpleadoPorVenta(cod, nom, salario));
        }
    }
    
    public static double pagarEmpleado(int cod){
        Empleado emp = buscar(cod);
        if(emp != null)
            return emp.pago();
        return 0;
    }
    
    public static void registrarVenta(int cod, double m){
        Empleado emp = buscar(cod);
        if(emp instanceof EmpleadoPorVenta)
            ((EmpleadoPorVenta)emp).actualizarVenta(m);
    }
    
    public static void setFechaFin(int cod, int y, int m, int d){
        Empleado emp = buscar(cod);
        if(emp instanceof EmpleadoTemporal)
            ((EmpleadoTemporal)emp).setFinContrato(y, m, d);
    }
    
    public static void imprimir(){
        int e=0, et=0, ev=0;
        
        for(Empleado emp : empleados){
            System.out.println("-"+emp);
            
            if(emp instanceof EmpleadoPorVenta)
                ev++;
            else if(emp instanceof EmpleadoTemporal)
                et++;
            else
                e++;
        }
        System.out.println(e+"-"+et+"-"+ev);
    }
    
    public static void main(String[] args) {
        empleados = new ArrayList<>();
    }
}
