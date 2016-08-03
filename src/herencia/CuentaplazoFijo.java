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
public class CuentaplazoFijo extends CuentaBancaria {
     private Calendar findePlazo;
  
    
    public CuentaplazoFijo(int n,String c,String t){
        super(n,c,t);
        findePlazo = Calendar.getInstance();
    }
    
    public void setPlazo(int y, int m, int d) {
          
        findePlazo.set(y,m,d);
        
    }
}