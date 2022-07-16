public class YearlyAppointment extends Appointment {
    private int a;
    private int b;
    private String c;
    
    public YearlyAppointment(int month, int day, String description) {
        this.a = month;
        this.b = day;
        this.c = description;
        setDescription(c);
    }
    public int getMonth() {
        return a;
    }
    public int getDay() {
        return b;
    }
    public boolean occursOn(int year, int month, int day) {
        if(getDay() == day && getMonth() == month) {
            return true;
        }
        else {
            return false;
        }
        
    } 
    public boolean equals(Object otherObject) {
        if(otherObject == this) {
            return true;
        }
        else if (otherObject instanceof YearlyAppointment) {
            YearlyAppointment other = (YearlyAppointment) otherObject;
            return c.equals(other.c);
        }
        return false;
        
    }
}