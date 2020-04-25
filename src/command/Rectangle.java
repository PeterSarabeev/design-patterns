package command;

public class Rectangle {
	private float x;
	private float y;

	Rectangle(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float GetSurface() {
		return x * y;
	}

	public float GetPerimeter() {
		return 2 * x + 2 * y;
	}
}
