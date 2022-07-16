import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Point;

class Test {
	@Test
	void testProblem1() {
		Robot robot = new Robot();
		assertEquals(true, robot.getLocation().equals(new Point(0, 0))); 
		assertEquals("N", robot.getDirection());
	}

	@Test
	void testProblem3() {
		LoginForm lf = new LoginForm("user", "password");
		assertFalse(lf.isLoggedIn());
		lf.input("user");
		lf.input("password");
		lf.click("Submit");
		assertTrue(lf.isLoggedIn());
	}
	
	@Test
	void testProblem5() {
		assertFalse(new ComboLock(0, 20, 39).open());
	}
	
	@Test
	void testProblem6() {
		BankAccount account1 = new BankAccount();
		assertTrue(account1.getBalance() <= 1e-14); 
		
		BankAccount account2 = new BankAccount(50.0);
		assertTrue(Math.abs(account2.getBalance() - 50) <= 1e-14); 
		
		BankAccount account3 = new BasicAccount(100.00);
		assertTrue(Math.abs(account3.getBalance() - 100) <= 1e-14); 
		
		assertTrue(BasicAccount.class.getSuperclass() == BankAccount.class);
	}
	
	@Test
	void testAppointment() {
		Appointment[] appointments = new Appointment[] {
			new DailyAppointment("Brush teeth"),
			new MonthlyAppointment(1, "Visit Grandma"),
			new OnetimeAppointment(2020, 11, 1, "Dentist appointment"),
			new YearlyAppointment(10, 31, "Trick or Treat"),
			new DailyAppointment("Write some code"),
			new MonthlyAppointment(31, "Change mascara"),
			new OnetimeAppointment(2020, 11, 1, "Dentist appointment")
		};

		int year = 2020, month = 10, day = 31;
		assertTrue(appointments[0].occursOn(year, month, day));
		assertFalse(appointments[1].occursOn(year, month, day));
		assertFalse(appointments[2].occursOn(year, month, day));
		assertTrue(appointments[3].occursOn(year, month, day));
		assertTrue(appointments[4].occursOn(year, month, day));
		assertTrue(appointments[5].occursOn(year, month, day));
		assertFalse(appointments[6].occursOn(year, month, day));
		
		assertFalse(appointments[1].equals(appointments[6]));
		assertTrue(appointments[2].equals(appointments[6]));
	}
	
	@Test
	void testOnetimeAppointment() {
		OnetimeAppointment a = new OnetimeAppointment(2020, 11, 2, "Lab 4 Due");
		assertEquals(2020, a.getYear());
		assertEquals(11, a.getMonth());
		assertTrue(a.occursOn(2020, 11, 2));
		assertTrue(a.equals(new OnetimeAppointment(2020, 11, 2, "Lab 4 Due")));
		assertTrue(OnetimeAppointment.class.getSuperclass() == Appointment.class);
	}
	
	@Test
	void testDailyAppointment() {
		DailyAppointment a = new DailyAppointment("Remember to stay healthy!");
		assertTrue(a.occursOn(2020, 11, 2));
		assertTrue(a.equals(new DailyAppointment("Remember to stay healthy!")));
		assertTrue(DailyAppointment.class.getSuperclass() == Appointment.class);
	}
	
	@Test
	void testMonthlyAppointment() {
		MonthlyAppointment a = new MonthlyAppointment(1, "First day of the month!");
		assertEquals(1, a.getDay());
		assertTrue(a.occursOn(2020, 12, 1));
		assertTrue(a.equals(new MonthlyAppointment(1, "First day of the month!")));
		assertTrue(MonthlyAppointment.class.getSuperclass() == Appointment.class);
	}
	
	@Test
	void testYearlyAppointment() {
		YearlyAppointment a = new YearlyAppointment(1, 1, "Happy New Year!");
		assertEquals(1, a.getMonth());
		assertEquals(1, a.getDay());
		assertTrue(a.occursOn(2020, 1, 1));
		assertTrue(a.equals(new YearlyAppointment(1, 1, "Happy New Year!")));
		assertTrue(YearlyAppointment.class.getSuperclass() == Appointment.class);
	}
}
