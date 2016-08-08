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
public class Gato extends Animal {

    public Gato() {
        super(4);
    }

    @Override
    public void hablar() {
        System.out.println("Miau Miau Miauuu");
    }

    @Override
    public void comer() {
        System.out.println("Leche, queso y Ratones");
    }
    
}
