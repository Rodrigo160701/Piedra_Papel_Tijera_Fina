import java.util.Scanner;

public class JugadorUsuario implements Jugador { /*
 * Creamos la clase JugadorUsurio con el que vamos jugador nosotros
 * desde la consola*/
    @Override // con el Overrida llamamos a la Interface Jugador//
    public String getEleccion() {
        Scanner scanner = new Scanner(System.in); /*Se crea un objeto Scanner para leer la entrada
         del usuario desde la consola*/
        String eleccion = ""; // Valor inicial
        boolean validEleccion = false;
        while (!validEleccion) {
            System.out.println("Elige piedra, papel o tijera:");
            eleccion = scanner.nextLine().toLowerCase();
            if (eleccion.equals("piedra") || eleccion.equals("papel") || eleccion.equals("tijera")) {
                validEleccion = true;
            } else {
                System.out.println("Comando inválido. Por favor, ingresa piedra, papel o tijera.");
            } /*Se ejecuta un bucle que solicita al jugador que elija entre "piedra", "papel" o "tijera".
            La entrada del jugador se lee y se convierte a minúsculas (toLowerCase()) para evitar problemas
            de mayúsculas/minúsculas. Si la elección es válida, el bucle se rompe; de lo contrario, se muestra un
            mensaje de error y se vuelve a solicitar al jugador que ingrese una elección válida.*/
        }
        return eleccion; /*Una vez que se ha obtenido una elección válida, la función devuelve la elección del jugador.*/
    }
}
