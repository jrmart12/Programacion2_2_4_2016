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
public class Gallo extends Animal {

    public Gallo() {
        super(2);
    }

    @Override
    public void hablar() {
        System.out.println("Ki KiriKiiii");
    }

    @Override
    public void comer() {
        System.out.println("Semillas y Gusanos");
    }
    
}
