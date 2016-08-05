/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.tg2;

import java.util.Calendar;

/**
 *
 * @author Aula
 */
public class EmpleadoTemporal extends Empleado {
    private Calendar finContrato;
    
    public EmpleadoTemporal(int codigo, String nombre, double salario) {
        super(codigo, nombre, salario);
        finContrato = Calendar.getInstance();
    }

    public void setFinContrato(int y, int m, int d) {
        finContrato.set(y, m-1,d);
    }

    @Override
    public String toString() {
        return super.toString()+" fin:"+finContrato.getTime(); 
    }

    @Override
    public double pago() {
        if(finContrato.after(Calendar.getInstance()))
            return salario;
        return 0; 
    }
    
    
}
