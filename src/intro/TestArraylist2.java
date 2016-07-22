/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.ArrayList;

/**
 *
 * @author Aula
 */
public class TestArraylist2 {
    public static void main(String[] args) {
        //No puedo crear arreglos usando el tipo primitivo
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(-5);
        
        ArrayList<Character> caras = new ArrayList<>();
        caras.add('H');
        
        //mi clase
        ArrayList<Alumno> als = new ArrayList<>();
        als.add( new Alumno("Frances") );
        als.add( new Alumno("Mae") );
        als.add( new Alumno("Monique") );
        als.add( new Alumno("Maria") );

        
        //1-Agreguen un nuevo alumno en la posicion 1
        als.add(1, new Alumno("Alicia"));
        
        //2- Hagan una busqueda propia para ver si esta el 
        // el alumno "Alicia"
        for(Alumno a : als){
            if(a.getNombre().equals("Alicia")){
                System.out.println("Esta Alicia!");
            }
        }
        
        //3- Modifiquen el nombre del alumno en la pos 3
        als.get(3).setNombre("Monica");
        
         for(Alumno a : als)
            a.print();
    }
}
