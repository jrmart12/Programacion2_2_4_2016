/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Calendar;

/**
 *
 * @author Aula
 */
public class CuentaAhorro extends CuentaBancaria {
    private Calendar ultimoUso;
    
    public CuentaAhorro(int n, String c, String t){
        super(n,c,t);
        tasa = 0.05;
    }
    
    public boolean isActiva(){
        return true;
    }
}
