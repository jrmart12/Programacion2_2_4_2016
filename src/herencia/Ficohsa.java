/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Aula
 */
public class Ficohsa {
    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro(1,"Frances","Lps");
        System.out.println(ca);
        
        if(ca instanceof CuentaAhorro)
            System.out.println("duh! si soy de Ahorro asi me llamo");
        if(ca instanceof CuentaBancaria)
            System.out.println("Ahh si! Es porque heredo de ella");
    }
}
