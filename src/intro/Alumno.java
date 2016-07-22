package intro;

/**
 *
 * @author Aula
 */
public class Alumno {
    //atributos
    private String nombre;
    private double promedio;
    
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void print(){
        System.out.println(nombre);
    }
}
