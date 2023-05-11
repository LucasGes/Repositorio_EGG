package relej03va;

import Entidades.Baraja;
import Entidades.Cartas;
import Servicio.ServicioBaraja;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class RelEj03va {

    public static void main(String[] args) {

        ServicioBaraja sb = new ServicioBaraja();
        ArrayList<Cartas> d = sb.crearBaraja();
        ArrayList<Cartas> m = new ArrayList();
        Baraja b1 = new Baraja();
        b1.setBaraja(d);
        b1.setMonton(m);

        menu(b1, sb);
    }

    public static void menu(Baraja b1, ServicioBaraja sb) {

        Scanner leer = new Scanner(System.in);
        int op = 0;
        System.out.println("MENU");
        System.out.println("----");
        System.out.println("Elija una opción: ");
        System.out.println("1 - Mezclar");
        System.out.println("2 - Pedir Carta");
        System.out.println("3 - Cartas Disponibles");
        System.out.println("4 - Pedir mas de una carta");
        System.out.println("5 - Mostrar cartas pedidas");
        System.out.println("6 - Mostrar cartas disponibles(Baraja)");
        System.out.println("7- Salir");
        op = leer.nextInt();

        switch (op) {

            case 1:
                b1.setBaraja(sb.mezclarBaraja(b1.getBaraja()));
                menu(b1, sb);
                break;
            case 2:
                System.out.println("Su carta es: \n");
                sb.siguienteCarta(b1);
                menu(b1, sb);
                break;
            case 3:
                sb.cartasDisponibles(b1);
                menu(b1, sb);
                break;
            case 4:
                sb.darCartas(b1);
                menu(b1, sb);
                break;
            case 5:
                sb.cartasMonton(b1);
                menu(b1, sb);
                break;
            case 6:
                sb.mostrarBaraja(b1);
                menu(b1, sb);
                break;
            case 7:
                System.out.println("Seguro que desea salir? S/N");
                String op3 = leer.next();
                switch (op3) {
                    case "s":
                        System.out.println("Saliendo...");
                        System.exit(0);
                    case "n":
                        menu(b1, sb);
                        break;
                    default:
                        System.out.println("Opción incorrecta, intente nuevamente.");
                        menu(b1, sb);
                        break;
                }
                default:
                        System.out.println("Opción incorrecta, intente nuevamente.");
                        menu(b1, sb);
                        break;
        }

    }

}
