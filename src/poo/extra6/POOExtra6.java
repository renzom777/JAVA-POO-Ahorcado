/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.extra6;

import java.util.Arrays;
import java.util.Scanner;
import poo.extra6.entidades.Ahorcado;
import poo.extra6.servicios.AhorcadoServicio;

/**
 *
 * @author GustM_000
 */
public class POOExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio ahorserv=new AhorcadoServicio();
        Ahorcado juego=ahorserv.crearJuego();
        
        boolean bandera1=Arrays.equals(juego.getPalabra(), juego.getPalabraModificada());
        do {        
            System.out.println("----------------------------");
            System.out.println("");
            ahorserv.longitud(juego);
            System.out.println("Ingresar letra a buscar en la palabra");
            String letra=leer.next();
            ahorserv.buscar(juego, letra);
            bandera1=Arrays.equals(juego.getPalabra(), juego.getPalabraModificada());
        } while (bandera1==false&&juego.getIntentos()>0);
        if (bandera1) {
            System.out.println("¡Felicitaciones! Descubriste la palabra");
        } else {
            System.out.println("La palabra es "+Arrays.toString(juego.getPalabra()));
        }
    }
    
}
