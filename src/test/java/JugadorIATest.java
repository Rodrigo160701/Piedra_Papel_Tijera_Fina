import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class JugadorIATest {

    @Test
    public void testGetEleccion() {
        JugadorIA jugadorIA = new JugadorIA();
        String[] expectedOptions = {"piedra", "papel", "tijera"};
        String[] actualOptions = new String[100];

        for (int i = 0; i < 100; i++) {
            actualOptions[i] = jugadorIA.getEleccion();
        }

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
