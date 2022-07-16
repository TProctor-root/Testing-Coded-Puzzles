public class OnetimeAppointment extends Appointment {
    private int a;
    private int b;
    private int c;
    private String d;
   
    public OnetimeAppointment(int year, int month, int day, String description) {
        this.a = year;
        this.b = month;
        this.c = day;
        this.d = description;
        setDescription(d);
    } 
    public int getYear() {
        return a;
    }
    public int getMonth() {
        return b;
    }
    public boolean occursOn(int year, int month, int day) {
        if(getMonth() == month && getYear() == year) {
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
        else if (otherObject instanceof OnetimeAppointment) {
            OnetimeAppointment other = (OnetimeAppointment) otherObject;
            return d.equals(other.d);
        }
        return false;
    } 
}
