/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Aula
 */
public class TestTimeZone {
    public static void main(String[] args) {
        Calendar honduras = Calendar.getInstance(TimeZone.getDefault());
        Calendar newYorkCity = Calendar.getInstance(TimeZone.getTimeZone("GMT-4"));
        Calendar japon = Calendar.getInstance(TimeZone.getTimeZone("GMT+9"));
        Calendar australia = Calendar.getInstance(TimeZone.getTimeZone("GMT+10"));
            
        System.out.println("Hora en Honduras "+honduras.get(Calendar.HOUR_OF_DAY)+":"+honduras.get(Calendar.MINUTE)+ " " + 
                    (honduras.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM"));
        System.out.println("Hora en NYC "+newYorkCity.get(Calendar.HOUR_OF_DAY)+":"+newYorkCity.get(Calendar.MINUTE));        
        System.out.println("Hora en Japon "+japon.get(Calendar.HOUR_OF_DAY)+":"+japon.get(Calendar.MINUTE));
        System.out.println("Hora en Australia "+australia.get(Calendar.HOUR_OF_DAY)+":"+australia.get(Calendar.MINUTE));
    }
}
