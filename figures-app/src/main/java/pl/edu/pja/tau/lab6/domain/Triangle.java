package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

public class Triangle implements Figure {

	private String name;

	public Triangle() {
		this.name =  this.getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1);
	}

	public String getName() {
		return name;
	}

	public Boolean canBeCrete(Integer[] sides) {
		return hasThreeElements(sides) && isValid(sides);
	}

	private boolean hasThreeElements(Integer[] sides) {
		return sides.length == 3;
	}

	private boolean isValid(Integer[] sides) {
		return sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0];
	}

	@Override
	public String toString() {
		return "Triangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
