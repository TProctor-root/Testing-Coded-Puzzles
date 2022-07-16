import java.awt.Point;

public class Robot {
	private String direction;
	private Point location;
	
	public Robot() {
		direction = "N";
		location = new Point(0,0);
	}
	public void turnLeft() {
		if(direction == "N") {
			direction = "W";
		}
		else if(direction == "S") {
			direction = "E";
		}
		else if(direction == "E") {
			direction = "N";
		}
		else if(direction == "W") {
			direction = "S";
		}
	}
	public void turnRight() {
		if(direction == "N") {
			direction = "E";
		}
		else if(direction == "S") {
			direction = "W";
		}
		else if(direction == "E") {
			direction = "S";
		}
		else if(direction == "W") {
			direction = "N";
		}
	}
	public boolean move() {
		if(direction == "N") {
			location.y += 1;
		}
		else if(direction == "S") {
			location.y -= 1;
		}
		else if(direction == "E") {
			location.x += 1;
		}
		else if(direction == "W") {
			location.x -= 1;
		}
		
		if(location.x >= 6 || location.y >= 6 || location.x <= -6 || location.y <= -6) {
			return false;	
		}
		return true;	
	}
	public Point getLocation() {
		return location;
	}
	public String getDirection() {
		return direction;
	}
}