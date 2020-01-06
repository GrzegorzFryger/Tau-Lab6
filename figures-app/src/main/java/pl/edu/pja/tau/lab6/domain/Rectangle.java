package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;

public class Rectangle extends Square implements Figure {

	private String name;

	public Rectangle() {
		this.name = this.getClass().getName();
	}

	public String getName() {
		return name;
	}

	public Boolean canBeCrete(Integer[] sides) {
		if (super.canBeCrete(sides)) {
			return true;
		}
		else if (sides[0].equals(sides[1]) && sides[2].equals(sides[3]))
			return true;
		else if (sides[0].equals(sides[3]) && sides[2].equals(sides[1]))
			return true;
		else if (sides[0].equals(sides[2]) && sides[3].equals(sides[1]))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
