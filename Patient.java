public class Patient implements Comparable<Patient> {
    
    private String name;
    private String illness;
    private String priority;
    
    public Patient(String name, String illness, String priority) {
        this.name = name;
        this.illness = illness;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient o) {
        return this.priority.compareTo(o.getPriority());
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
