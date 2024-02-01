import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class JugadorIATest {

    @Test
    public void testGetEleccion() {
        // Creamos una instancia de JugadorIA
        JugadorIA jugadorIA = new JugadorIA();

        // Definimos un conjunto de opciones esperadas que puede elegir la IA
        String[] expectedOptions = {"piedra", "papel", "tijera"};

        // Creamos un array para almacenar las opciones reales obtenidas
        String[] actualOptions = new String[100];

        // Iteramos 100 veces para obtener 100 elecciones de la IA
        for (int i = 0; i < 100; i++) {
            actualOptions[i] = jugadorIA.getEleccion();
        }

        // Verificamos que cada opción obtenida esté dentro de las opciones esperadas
        for (int i = 0; i < 100; i++) {
            assertTrue(contains(expectedOptions, actualOptions[i]));
        }
    }


    private boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
