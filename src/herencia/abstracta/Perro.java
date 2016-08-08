/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.abstracta;

/**
 *
 * @author Aula
 */
public class Perro extends Animal {
    
    public Perro(){
        super(4);
    }

    @Override
    public void hablar() {
        System.out.println("Guau Guau Guau");
    }

    @Override
    public void comer() {
        System.out.println("Huecitos, Doggy Food, Croquetas");
    }
}
