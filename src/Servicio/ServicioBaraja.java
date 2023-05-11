/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Baraja;
import Entidades.Cartas;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ServicioBaraja {

    Scanner leer = new Scanner(System.in);

    public ArrayList<Cartas> crearBaraja() {

        int q = 1; // numeros
        int j = 1; // palo
        String p = "Espada";

        ArrayList<Cartas> baraja = new ArrayList();

        for (int i = 1; i < 12; i++) {

            Cartas c = new Cartas();
            if (i == 8) {
                q = 10;
            }
            if (i == 9) {
                q = 11;
            }
            if (i == 10) {
                q = 12;
            }
            if (i == 11) {
                q = 1;
                i = 1;
            }

            if (j == 11 && j < 21) {
                p = "Oro";
            }
            if (j == 21 && j < 32) {
                p = "Copa";
            }
            if (j == 31 && j < 43) {
                p = "Basto";
            }

            c.setNumero(q);
            c.setPalo(p);
            baraja.add(c);

            if (j == 40) {
                break;
            }
            q++;
            j++;

        }

        return baraja;
    }

    public ArrayList mezclarBaraja(ArrayList<Cartas> f) {
        ArrayList<Cartas> f1 = new ArrayList(f);
        shuffle(f1);
        for (Cartas q : f1) {
            System.out.println(q);
        }

        return f1;

    }

    public void siguienteCarta(Baraja b1) {

        for (Cartas q : b1.getBaraja()) {
            System.out.println(q);
            b1.getMonton().add(q);
            b1.getBaraja().remove(q);
            b1.getBaraja().trimToSize();

            break;
        }
//              Iterator it = b1.getBaraja().iterator();
//        }
//         while (it.hasNext()) {
//            System.out.println(it.next());
//        
//            fk.remove(it.next());
//            
//        }
    }

    public void cartasDisponibles(Baraja b1) {

        System.out.println("Cartas diponibles:" + b1.getBaraja().size());
    }

    public void darCartas(Baraja b1) {

        System.out.println("Ingrese la cantidad de cartas que desea");
        int pc = leer.nextInt();
       
        if (b1.getBaraja().size()<pc) {
            
            System.out.println("No hay tantas cartas disponibles.\n");
           
        } else{
            
            System.out.println("Sus cartas son: \n");
        for (int i = 0; i < pc; i++) {
            
            siguienteCarta(b1);
            
        }
        }

    }

    public void cartasMonton(Baraja b1) {
        System.out.println("Las cartas que tienes son: \n");
        for (Cartas q : b1.getMonton()) {
            System.out.println(q);
        }
        
          }

    public void mostrarBaraja(Baraja b1) {
        System.out.println("Las cartas disponibles son: \n");
for (Cartas q : b1.getBaraja()) {
            System.out.println(q);
        }
    }

}
