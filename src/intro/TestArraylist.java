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
public class TestArraylist {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        /*
        Agregar valores
            array[x] = valor;
        */
        lista.add("Carlos");
        lista.add("Jose");
        lista.add("Alejandro");
        /*
        imprimir con foreach
        */
        for(String cad : lista){
            System.out.println("-"+cad);
        }
        /*
        Imprimir con un for normal
            size en normal: array.length
        */
        System.out.println("\n----for normal");
        int size = lista.size();
        for(int p=0; p < size; p++){
            System.out.println("-"+ lista.get(p));
        }
        
        /*
        Agregar en una posicion especifico
        */
        lista.add(2,"Kevin");
        System.out.println("\n--Agregar en una pos especifica");
        for(String cad : lista){
            System.out.println("-"+cad);
        }
        /*
        Modificar el valor de una posicion
        */
        lista.set(0, "Gochez");
        System.out.println("\n--Modificar una pos especifica");
        for(String cad : lista){
            System.out.println("-"+cad);
        }
        
        /*
        Remover valores
        */
        lista.remove(1);
        System.out.println("\n--Remover una pos especifica");
        for(String cad : lista){
            System.out.println("-"+cad);
        }
        
        /*
        Buscar valores
            PERO OJO: Solo funciona con valores primitivos o
            Clases que han modificado su funcion equals( ) como la
            String
        */
        if( lista.contains("Alejandro") )
            System.out.println("Si, tiene guardado Alejandro");
        
        lista.clear();
    }
}
