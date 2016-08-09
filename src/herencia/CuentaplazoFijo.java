/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Calendar;

/**
 *
 * @author Mae Lindell
 */
public class CuentaPlazoFijo extends CuentaBancaria {
     private Calendar findePlazo;
  
    
    public CuentaPlazoFijo(int n,String c,String t){
        super(n,c,t);
        findePlazo = Calendar.getInstance();
    }
    
    public void setPlazo(int y, int m, int d) {
        findePlazo.set(y,m,d);
    }
    
    @Override
    public void quienSoy(){
        System.out.println("CuentaPlazoFijo Hija");
    }

    @Override
    public String toString() {
        return super.toString()+", finPlazo"+findePlazo.getTime();
    }
    
    
}
