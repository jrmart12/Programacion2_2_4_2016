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
    
    public static int potDown(int b, int e){
        return potDown(b, e, 1);
    }
    
    private static int potDown(int b, int e, int pot){
        if(e > 0)
            return potDown(b, e-1, pot*b);
        return pot;
    }
    
    public static boolean isPalindromo(String s){
        return isPalindromo(s,0,s.length()-1);
    }

    private static boolean isPalindromo(String s, int ini, int fin) {
        if(ini < fin){
            if(s.charAt(ini) == s.charAt(fin))
                return isPalindromo(s,ini+1,fin-1);
            return false;
        }
        return true;
    }
    
    public static int mcd(int n1, int n2){
        return mcd(n1,n2,2);
    }

    private static int mcd(int n1, int n2, int d) {
        if(n1 >= d && n2 >= d){
            if(n1 % d == 0 && n2 % d == 0)
                return mcd(n1/d, n2/d, d) * d;
            return mcd(n1, n2, d+1);
        }
        return 1;
    }
    
    public static void piramide(int filas){
        piramide(filas,1,1);
    }

    private static void piramide(int filas, int f, int c) {
        if(f <= filas){
            if(c <= f){
                System.out.print("*");
                piramide(filas, f, c+1);
            }
            else{
                System.out.println("");
                piramide(filas, f+1, 1);
            }
        }
    }
    
    public static int fibonacci(int n){
        if(n > 1)
            return fibonacci(n-1) + fibonacci(n-2);
        return n;
    }
    
    /*desco(4)
     => 1+1+1+1
         2+2
        3+1
     */
    public static void desco(int n){
        desco(n,1,0, " ", n);
    }

    private static void desco(int n, int pos, int s, String cad, int n2) {
        if(s == n2)
            System.out.println(cad);
        for(int i=pos; i <= n; i++)
            desco(n-i, i, s+i, cad+i+" ", n2);
    }
}
