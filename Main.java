class Main {
	
	public static void main(String[] args) {
		
		Robot robot = new Robot();
		System.out.println(robot.move()); 
		// location now 0, 1; returns true
		robot.turnLeft(); 
		// location still 0, 1
		System.out.println(robot.move()); 
		// location now -1, 1; returns true
		System.out.println(robot.move()); 
		// location now -2, 1; returns true
		System.out.println(robot.move()); 
		// location now -3, 1; returns true
		System.out.println(robot.move()); 
		// location now -4, 1; returns true
		System.out.println(robot.move()); 
		// location now -5, 1; returns true
		System.out.println(robot.move()); 
		// location now -6, 1; returns false
		System.out.println(robot.move()); 
		// location now -7, 1; returns false
		
		System.out.println();		
		
		LoginForm login = new LoginForm("admin", "admin123");
		login.input("test");
		login.input("test123");
		login.click("Submit");
		System.out.println(login.isLoggedIn()); 
		// returns false
		login.input("admin");
		login.input("admin123");
		login.click("Reset");
		System.out.println(login.isLoggedIn()); 
		// returns false
		login.click("Submit");
		System.out.println(login.isLoggedIn()); 
		// returns false
		login.input("admin");
		login.input("admin123");
		login.input("test");
		login.input("test123");
		login.click("Submit");
		System.out.println(login.isLoggedIn()); 
		// returns true
		login.input("test");
		login.input("test123");
		login.click("Submit");
		System.out.println(login.isLoggedIn()); 
		// returns true
		
		System.out.println();
		
		ComboLock lock = new ComboLock(38, 14, 7);
		lock.turnRight(2);
		lock.turnLeft(16);
		lock.turnRight(7);
		System.out.println(lock.open()); 
		// returns true
		lock.reset();
		lock.turnRight(2);
		lock.turnLeft(21);
		lock.turnRight(7);
		System.out.println(lock.open()); 
		// returns false
		
		System.out.println();
		
		BankAccount account = new BasicAccount(100.00); // creates a BasicAccount with an initial balance of 100.00
		account.withdraw(80.00); 
		System.out.println(account.getBalance()); 
		// returns 20.0
		account.withdraw(50.00);
		// amount won't be withdrawn since it's greater than balance
		System.out.println(account.getBalance()); 
		// returns 20.0
		
		Appointment[] appointments = new Appointment[7];
		appointments[0] = new DailyAppointment("Brush teeth");
		appointments[1] = new MonthlyAppointment(1, "Visit Grandma");
		appointments[2] = new OnetimeAppointment(2020, 11, 1, "Dentist appointment");
		appointments[3] = new YearlyAppointment(10, 31, "Trick or Treat");
		appointments[4] = new DailyAppointment("Write some code");
		appointments[5] = new MonthlyAppointment(31, "Change mascara");
		appointments[6] = new OnetimeAppointment(2020, 11, 1, "Dentist appointment");

		System.out.println();
		
		int year = 2020;
		int month = 10;
		int day = 31;
		 
		System.out.println("Your appointments on " + month + "/" + day + "/" + year + ":");
		for (Appointment a : appointments) {
		  if (a.occursOn(year, month, day)) {
		    System.out.println(a);
		  }
		}
		System.out.println(appointments[1].equals(appointments[6]));
		System.out.println(appointments[2].equals(appointments[6]));

		// ===========================
		// The above code prints:
		// Your appointments on 10/31/2020:
		// Brush teeth
		// Trick or Treat
		// Write some code
		// Change mascara
		// false
		// true	 
		
	}
}
