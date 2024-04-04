/**
 * Clase que representa un paciente de hospital
 * @author Ultimate-Truth-Seeker
 */
public class Patient implements Comparable<Patient> {
    
    private String name;
    private String illness;
    private String priority; // cadena de texto de un solo caracter
    
    /**
     * constructor del paciente
     * @param name nombre del paciente
     * @param illness descripción del síntoma 
     * @param priority código de emergencia
     */
    public Patient(String name, String illness, String priority) {
        this.name = name;
        this.illness = illness;
        this.priority = priority;
    }

    /**
     * compara la prioridad de los pacientes en base a su código
     */
    @Override
    public int compareTo(Patient o) {
        return this.priority.compareTo(o.getPriority()); // como el orden de las letras sigue el orden alfabético es aplicable esta comparación
    }

    public String getName() {
        return name;
    }

    public String getIllness() {
        return illness;
    }

    public String getPriority() {
        return priority;
    }
    
}
