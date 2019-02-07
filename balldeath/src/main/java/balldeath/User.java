package balldeath;

public class User {
	
	private int x;
	
	private int y;
	
	private int status;

	private int id; 
	
	
	public User(int x, int y, int status, int id) {
		super();
		this.x = x;
		this.y = y;
		this.status = status;
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
