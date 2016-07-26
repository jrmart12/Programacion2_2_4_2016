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
    
    public static int sumaNUp(int n){
        if(n>=1)
            return sumaNUp(n-1) + n;
        return 0;
    }
    
    public static int sumaNDown(int n){
        return sumaNDown(n,0);
    }

    private static int sumaNDown(int n, int suma) {
        if(n >= 1)
            return sumaNDown(n-1, suma+n);
        return suma;
    }
    
    public static int potUp(int b, int e){
        if(e > 0)
            return potUp(b,e-1) * b;
        return 1;
    }
    
    
}
