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
public class Plan {
    protected int numero;
    protected String cliente;
    protected double precio;
    
    public Plan(int n,String c, double p){
        numero = n;
        cliente = c;
        precio = p;
    }
    
    @Override
    public String toString(){
        return numero+cliente+precio;
    }
}
