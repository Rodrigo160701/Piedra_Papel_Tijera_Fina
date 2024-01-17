import java.util.Random;

public class JugadorIA implements Jugador {
    @Override // con el Overrida llamamos a la Interface Jugador//
    public String getEleccion() {
        Random random = new Random();
        String[] opciones = {"piedra", "papel", "tijera"};
        String eleccion = opciones[random.nextInt(opciones.length)];
     /*Se crea un objeto Random para generar números aleatorios. Luego, se declara un array de opciones
     que puede elegir el jugador IA: "piedra", "papel" o "tijera"*/
        System.out.println("El jugador IA ha elegido: " + eleccion);
        return eleccion;/*Aquí hacemos que aparezca en consola que ha elegido el JugadorIA*/
    }
}