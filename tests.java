import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * tests para los métodos del vetorHeap
 */
public class tests {
    private VectorHeap<Patient> vectorHeap;
    private Patient patient1 = new Patient("Juan Perez", "fractura de pierna", "C");
    private Patient patient2 = new Patient("Maria Ramirez", "apendicitis", "A");

    // test de inserción
    @Test
    public void testInsert() {
        vectorHeap = new VectorHeap<>();
        vectorHeap.add(patient1);
        vectorHeap.add(patient2);
        assertTrue(!vectorHeap.isEmpty());
        assertEquals(2, vectorHeap.size());
    }

    // test de eliminación
    @Test
    public void testRemove() {
        vectorHeap = new VectorHeap<>();
        vectorHeap.add(patient1);
        vectorHeap.add(patient2);
        assertEquals(patient2, vectorHeap.remove());
        assertEquals(patient1, vectorHeap.remove());
    }

}
