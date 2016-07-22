/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author Aula
 */
public class Alumno {
    //atributos
    private String nombre;
    //constructor
    public Alumno(String nombre){
        this.nombre = nombre;
    } 
    //funciones
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void print(){
        System.out.println(nombre);
    }
}
