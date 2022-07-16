public class ComboLock {
	private int a;
	private int b;
	private int c;

	private int num;
	private int [] keep;
	private int set;
	
	public ComboLock(int num1, int num2, int num3) {
		a = num1;
		b = num2;
		c = num3;
		
		num = 0;
		keep = new int[3];
		set = 0;
	}
	public void reset() {
		num = 0;
		keep = new int[3];
		set = 0;
	}
	public void turnLeft(int ticks) {
		num = num + ticks;
			
		if(num < 0) {
			num = 40 + num; 
		}
		else if (num > 39){
			num = num - 40;
		}
		
		keep[set] = num;
		set++;	
	}
	public void turnRight(int ticks) {
		num = num - ticks;
		
		if(num < 0) {
			num = 40 + num; 
		} 
		
		else if (num > 39){
			num = num - 40;
		} 
		
		keep[set] = num;
		set++;		
	}
	public boolean open() {
		if(keep[0] == a) {
			if(keep[1] == b) {
				if(keep[2] == c) {
					return true;
				}
			}
		}
		return false;
	}
} 