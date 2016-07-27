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
public class TestRecursion {
    public static void main(String[] args) {
        
        System.out.println("Print(5): \n-------------");
        FuncionesRecursivas.print(5);
        
        System.out.println("PrintMismo(5,3): \n-------------");
        FuncionesRecursivas.printMismo(5, 5);
        
        System.out.println("Suma(5): \n-------------");
        System.out.println("Up: "+FuncionesRecursivas.sumaNUp(5));
        System.out.println("Down: "+FuncionesRecursivas.sumaNDown(5));
        
        System.out.println("pot(2,5): \n-------------");
        System.out.println("Up: "+FuncionesRecursivas.potUp(2,5));
        System.out.println("Up: "+FuncionesRecursivas.potDown(2,5));
        
        System.out.println("Palindromo: \n-------------");
        System.out.println("HANNAH: "+FuncionesRecursivas.isPalindromo("HANNAH"));
        System.out.println("LEAL: "+FuncionesRecursivas.isPalindromo("LEAL"));
        
        System.out.println("MCD: \n-------------");
        System.out.println("Entre (36,24): "+FuncionesRecursivas.mcd(36,24));
    }
}
