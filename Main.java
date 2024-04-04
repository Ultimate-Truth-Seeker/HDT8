import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Programa para colas de Hospital
 * @author Ultimate-Truth-Seeker
 */
public class Main {
    /**
     * Nombre del archivo de lectura
     */
    private final static String filename = "pacientes.txt";

    public static void main(String[] args) {
        // priority queue para los pacientes
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>();

        // lectura y carga de los datos al queue
        try (Scanner sc = new Scanner(new File(filename))) {
            Scanner scn;
            while (sc.hasNextLine()) {
                scn = new Scanner(sc.nextLine());
                scn.useDelimiter(",");
                Patient patient = new Patient(scn.next(), scn.next(), scn.next());
                priorityQueue.add(patient);
            }
            
        } catch (Exception e) { // salida del programa si no se puede leer el archivo
            System.err.println("* Error en la lectura del archivo!");
            return;
        }

        // Se retiran uno por uno a los pacientes, ordenados por prioridad
        while (!priorityQueue.isEmpty()) {
            Patient out = priorityQueue.remove();
            System.out.println(out.getName()+ out.getIllness() + out.getPriority());
        }

    }
}
