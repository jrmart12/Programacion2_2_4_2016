/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.abstracta;

import java.util.ArrayList;

/**
 *
 * @author Aula
 */
public class Granja {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Gallo());
        animales.add(new Pollito());
        animales.add(new Colibri());
        
        for(Animal ani : animales){
            System.out.println("----------");
            ani.hablar();
            System.out.print("Que comes?: ");
            ani.comer();
        }
    }
}
