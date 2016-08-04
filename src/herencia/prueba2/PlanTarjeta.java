/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.prueba2;

/**
 *
 * @author Aula
 */
public class PlanTarjeta extends Plan {
    private double saldo;
    
    public PlanTarjeta(int n, String c){
        super(n,c,0);
        saldo = 500;
    }
    
    @Override
    public String toString(){
        return super.toString()+saldo;
    }
}
