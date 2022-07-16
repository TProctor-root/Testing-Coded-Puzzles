public class MonthlyAppointment extends Appointment {
    private int a;
    private String b;
    
    public MonthlyAppointment(int day, String description) {
        this.a = day;
        this.b = description;
        setDescription(b);
    }
    public int getDay() {
        return a;
    }
    public boolean occursOn(int year, int month, int day) {
        if(getDay() == day) {
            return true;
        }
        else {
            return false;
        }
        
    } 
    public boolean equals(Object otherObject) {
        if(otherObject == this.b) {
            return true;
        }
        else if (otherObject instanceof MonthlyAppointment) {
            MonthlyAppointment other = (MonthlyAppointment) otherObject;
            return b.equals(other.b);
        }
        return false;
    } 
}