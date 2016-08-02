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
public class CuentaBancaria {
    protected int numero;
    protected double saldo, tasa;
    protected String cliente, tipo;
    protected Calendar apertura;

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasa() {
        return tasa;
    }

    public String getCliente() {
        return cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public Calendar getApertura() {
        return apertura;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
    
    public void depositar(double m){
        saldo += m;
    }
    
    public boolean retirar(double m){
        if(m < saldo){
            saldo -= m;
            return true;
        }
        return false; 
    }
}
