/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class TrabajoGrupo1 {
    int numeros[];
    static Scanner lea = new Scanner(System.in);
    
    public TrabajoGrupo1(int lon){
        numeros = new int[lon];
    }
    
    //llenar---
    public void llenar(){
        llenar(0);
    }

    private void llenar(int pos) {
        if(pos < numeros.length){
            System.out.print("Valor para ["+pos+"]: ");
            numeros[pos] = lea.nextInt();
            llenar(pos+1);
        }
    }
    
    //print---
    public void print(){
        print(0);
    }

    private void print(int pos) {
        if(pos < numeros.length){
            System.out.print("["+numeros[pos]+"]");
            print(pos+1);
        }
        else
            System.out.println("");
    }
    
    //suma----
    public int suma(){
        return suma(0);
    }

    private int suma(int pos) {
        if(pos < numeros.length)
            return suma(pos+1) + numeros[pos];
        return 0;
    }
    
    //Divisibles----
    public int divisibleEntre(int div){
        return divisibleEntre(div, 0);
    }

    private int divisibleEntre(int div, int pos) {
        if(pos < numeros.length){
            if(numeros[pos]  % div == 0)
                return divisibleEntre(div, pos+1) + 1;
            return divisibleEntre(div, pos+1);
                        
        }
        return 0;
    }
    
    //buscar----
    public boolean buscar(int n){
        return buscar(n, 0);
    }

    private boolean buscar(int n, int pos) {
        if(pos < numeros.length){
            if(numeros[pos] == n)
                return true;
            return buscar(n,pos+1);
        }
        return false;
    }
    
    //maximo----
    public int maximo(){
        return maximo(0,Integer.MIN_VALUE);
    }

    private int maximo(int pos, int max) {
        if(pos < numeros.length){
            if(numeros[pos] > max)
                max = numeros[pos];
            return maximo(pos+1, max);
        }
        return max;
    }
    
    //factorial------
    public int factorialDe(int pos){
        if(pos >= 0 && pos < numeros.length)
            return factorial(numeros[pos]);
        else{
            System.out.println("Posicion No Existe");
            return 0;
        }
    }

    private int factorial(int n) {
        if(n > 0)
            return factorial(n-1) * n;
        return 1;
    }
    
    //reemplazar------
    public void reemplazar(int viejo, int nuevo){
        reemplazar(viejo, nuevo, 0);
    }

    private void reemplazar(int viejo, int nuevo, int pos) {
        if(pos < numeros.length){
            if(numeros[pos] == viejo)
                numeros[pos] = nuevo;
            reemplazar(viejo, nuevo, pos+1);
        }
    }
    
    //Hay primo?------
    public int hayPrimo(){
        for(int pos=0; pos < numeros.length; pos++){
            if(numeros[pos] > 1 && primo(numeros[pos],2))
                return pos;
        }
        return -1;
    }

    private boolean primo(int n, int c) {
        if(c < n){
            if(n % c == 0)
                return false;
            return primo(n, c+1);
        }
        return true;
    }
    
    //Suma Digitos-----
    public int sumaDigitosDe(int pos){
        if(pos >= 0 && pos < numeros.length)
            return sumaDigitos(numeros[pos]);
        else{
            System.out.println("Posicion No Existe");
            return 0;
        }
    }

    private int sumaDigitos(int num) {
        if(num > 0)
            return sumaDigitos(num/10) + (num%10);
        return 0;
    }
    
    //Sort----
    public void sort(){
        quicksort(0,numeros.length-1);
    }

    private void quicksort(int low, int high) {
        if (low >= high)
                return;

        // determinar el pivote
        int middle = low + (high - low) / 2;
        int pivot = numeros[middle];

        // que el izquierdo < pivot y derecho > pivot
        int i = low, j = high;
        while (i <= j) {
                while (numeros[i] < pivot) {
                        i++;
                }

                while (numeros[j] > pivot) {
                        j--;
                }

                if (i <= j) {
                        int temp = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = temp;
                        i++;
                        j--;
                }
        }

        // partir y recursivamente ordenar cada parte
        if (low < j)
                quicksort(low, j);

        if (high > i)
                quicksort(i, high);
    }
    
    public static void main(String[] args) {
        
    }
    
}
