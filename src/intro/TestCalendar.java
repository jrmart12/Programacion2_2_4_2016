/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Aula
 */
public class TestCalendar {
    public static void main(String[] args) {
        //hoy
        Calendar hoy = Calendar.getInstance();
        System.out.println("hoy: "+hoy.getTime());
        //monique
        Calendar monique = Calendar.getInstance();
        monique.set(1997, Calendar.MARCH, 17);
        System.out.println("Monique nacio en: "+monique.getTime());
        
        //comparacion
        if(monique.before(hoy))
            System.out.println("Monique nacio antes que hoy");
        if(hoy.after(monique))
            System.out.println("Si, hoy es despues que nacio Monique");
        if(monique.getTimeInMillis() <= hoy.getTimeInMillis())
            System.out.println("Si ombe! Monique nacio antes que hoy!");
        
        //valores individuales
        System.out.println("Año de Monique: "+ monique.get(Calendar.YEAR) );
        System.out.println("Dia en el año de Monique: "+ monique.get(Calendar.DAY_OF_YEAR) );
        System.out.println("Mes de Monique: "+ monique.get(Calendar.MONTH) );
        
        //sumar o restar
        hoy.add(Calendar.YEAR, 1);
        System.out.println("hoy en un año: "+hoy.getTime());
        hoy.add(Calendar.MONTH, -8);
        System.out.println("..menos 8 meses: "+hoy.getTime());
        
        Calendar hace10 = Calendar.getInstance();
        hace10.add(Calendar.YEAR, -10);
        
        if(monique.before(hace10))
            System.out.println("Monique tiene mas de 10 años");
        
        //sacar los nombres
        String diaita = monique.getDisplayName(Calendar.DAY_OF_WEEK, 
                Calendar.LONG, Locale.ITALIAN);
        String mesita = monique.getDisplayName(Calendar.MONTH, 
                Calendar.LONG, Locale.ITALIAN);
        //español
        String diaes = monique.getDisplayName(Calendar.DAY_OF_WEEK, 
                Calendar.LONG, Locale.forLanguageTag("es"));
        String meses = monique.getDisplayName(Calendar.MONTH, 
                Calendar.LONG, Locale.forLanguageTag("es"));
        
        //holandes
        String diahol = monique.getDisplayName(Calendar.DAY_OF_WEEK, 
                Calendar.LONG, Locale.forLanguageTag("nl"));
        String meshol = monique.getDisplayName(Calendar.MONTH, 
                Calendar.LONG, Locale.forLanguageTag("nl"));
        
        String diafra = monique.getDisplayName(Calendar.DAY_OF_WEEK, 
                Calendar.LONG, Locale.FRENCH);
        String mesfra = monique.getDisplayName(Calendar.MONTH, 
                Calendar.LONG, Locale.FRENCH);
        
        System.out.println("Monique en Italiano: "+diaita+"-"+mesita);
        System.out.println("Monique en Español: "+diaes+"-"+meses);
        System.out.println("Monique en Holandes: "+diahol+"-"+meshol);
        System.out.println("Monique en Frances: "+diafra+"-"+mesfra);
    }
}
