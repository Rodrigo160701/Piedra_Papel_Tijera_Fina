import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        jugar();
    }
    public static void jugar() {
        boolean juegoTerminado = false;
        Scanner scanner = new Scanner(System.in);
        JugadorIA jugadorIA = new JugadorIA(); // Creamos  la instacia del JugadorIA
        int contadorGanadasJugador1 = 0;
        int contadorGanadasJugador2 = 0;
        int contadorPartidas = 0;
        while (!juegoTerminado) {
            int resultado = jugarRonda(new JugadorUsuario(), jugadorIA);
            if (resultado == 0) {
                System.out.println("Empate");
            } else if (resultado == 1) {
                System.out.println("Ganador: Jugador 1");
                contadorGanadasJugador1++;
            } else {
                System.out.println("Ganador: Jugador 2");
                contadorGanadasJugador2++;
            }

            contadorPartidas++;

            if (contadorGanadasJugador1 == 3 || contadorGanadasJugador2 == 3) {
                juegoTerminado = true;
            } //Se utiliza un bucle while para continuar jugando hasta que uno de los jugadores alcance 3 victorias//

            if (!juegoTerminado) {
                System.out.println("¿Quieres jugar otra ronda? (si/no)");
                String continuar = scanner.nextLine().toLowerCase();
                juegoTerminado = !continuar.equals("si");
            }
        }//Si el juego ha termiando te pregunta si quieres jugar otra ronda//

        if (contadorGanadasJugador1 == 3) {
            System.out.println("Jugador 1 es el ganador!");
        } else {
            System.out.println("Jugador 2 es el ganador!");
        }

        System.out.println("Resultados:");
        System.out.println("Jugador 1: " + contadorGanadasJugador1 + " victorias");
        System.out.println("Jugador 2: " + contadorGanadasJugador2 + " victorias");
    }//se encarga de imprimir los resultados finales del juego después de que se haya determinado un ganador o si se ha decidido terminar el juego//
    private static int jugarRonda(JugadorUsuario jugadorUsuario, JugadorIA jugadorIA) {
        String eleccionJugador1 = jugadorUsuario.getEleccion();
        String eleccionJugador2 = jugadorIA.getEleccion();

        if (eleccionJugador1.equals(eleccionJugador2)) {
            return 0;
        } else if ((eleccionJugador1.equals("piedra") && (eleccionJugador2.equals("tijera"))) ||
                (eleccionJugador1.equals("tijera") && (eleccionJugador2.equals("papel"))) ||
                (eleccionJugador1.equals("papel") && (eleccionJugador2.equals("piedra")))) {
            return 1;
        } else {
            return 2;
            //simula una ronda del juego piedra, papel o tijera entre JugadorUsuario y JugadorIA//
        }
    }
}
