/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.tg2;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Aula
 */
public class EmpleadoPorVenta extends Empleado {
    private double ventas[] = {0,0,0,0,0,0,0,0,0,0,0,0};

    public EmpleadoPorVenta(int codigo, String nombre, double salario) {
        super(codigo, nombre, salario);
    }
    
    private int mesActual(){
        Calendar hoy = Calendar.getInstance();
        return hoy.get(Calendar.MONTH);
    }
    
    public void actualizarVenta(double v){
        ventas[mesActual()] += v;
    }
    
    public double comision(){
        return ventas[mesActual()]*0.05;
    }

    @Override
    public String toString() {
        Calendar hoy = Calendar.getInstance();
        String mes = hoy.getDisplayName(Calendar.MONTH, 
                Calendar.LONG, Locale.forLanguageTag("es"));
        
        return super.toString()+" tasa: 5%, venta de "+mes+
                ": "+ventas[mesActual()]; 
    }

    @Override
    public double pago() {
        return salario + comision();
    }
    
    
}
