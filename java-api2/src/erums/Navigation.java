package erums;

public class Navigation {

	private Direction drection;
	private String msg;
	public Direction getDrection() {
		return drection;
	}

	public void setDrection(int i) {

		switch (i) {
		case 1: this.drection = Direction.동; break;
		case 2: this.drection = Direction.서; break;
		case 3: this.drection = Direction.남; break;
		case 4: this.drection = Direction.북; break;
		default:
			break;
		}

	}
}
