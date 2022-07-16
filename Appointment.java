public abstract class Appointment {
    private String description;
    
    public Appointment() {
        description = "";
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public abstract boolean occursOn(int year, int month, int day);
    public String toString() {
        return description;
    }
    public boolean equals(Object otherObject) {
        if(otherObject == this.description) {
            return true;
        }
        else if(otherObject instanceof Appointment) {
            Appointment other = (Appointment) otherObject;
            return description.equals(other.description); 
        }
        return false;
    } 
}