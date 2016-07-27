/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Aula
 */
public class FuncionesRecursivas {
    
    public static void print(int n){
        if(n>1)
            print(n-1);
        System.out.println(n);
    }
    
    public static void printMismo(int n, int repeat){
        
        if(repeat > 0){
            System.out.println(n);
            printMismo(n, repeat-1);
        }
    }
}
