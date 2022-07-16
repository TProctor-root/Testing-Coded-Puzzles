public class DailyAppointment extends Appointment {
    private String a;
    
    public DailyAppointment(String description) {
        this.a = description;
        setDescription(a);
    }
    public boolean occursOn(int year, int month, int day) {
        return true;
    } 
    public boolean equals(Object otherObject) {
        if(otherObject == this.a) {
            return true;
        }
        else if (otherObject instanceof DailyAppointment) {
            DailyAppointment other = (DailyAppointment) otherObject;
            return a.equals(other.a);
        }
        return false;
    } 
}