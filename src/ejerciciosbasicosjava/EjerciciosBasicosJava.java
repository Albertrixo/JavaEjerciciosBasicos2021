/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Alberto
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuántas bellotas haya
        if(finDeSemana){
            return true;
        }
        //si llega aquí es que no es fin de semana
        if(numBellotas >= 40 && numBellotas <=60){
            return true;
        }
        return false;
    }
    
/**
 * multa : Estás    conduciendo    demasiado    rápido,    y    un    policía ..
     * @param velocidad entre 60 y 80
     * @param birthday te quitan 5
     * @return 
 */
    public int multa (int velocidad, boolean birthday){
        if(birthday){
            velocidad = velocidad - 5; //velocidad -= 5;
        }
        //si va a menos de 60 por hora
        if (velocidad <= 60){
            return 0;
      } 
        if(velocidad > 60 && velocidad <= 80){
            return 1; //multa pequeña
        }
        //en cualquier otro valor que tuviera velocidad devolvemos la multa grande
        return 2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio  = new EjerciciosBasicosJava();
      //ejercicio.fiestaArdillas(0, true);
        System.out.println("Ejercicio Ardillas:");
        System.out.println( ejercicio.fiestaArdillas(30, false));
        System.out.println( ejercicio.fiestaArdillas(50, false));
        System.out.println( ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio multa:");
        System.out.println( ejercicio.multa(60, false));
        System.out.println( ejercicio.multa(65, false));
        System.out.println( ejercicio.multa(65, true));
    }
    
}
