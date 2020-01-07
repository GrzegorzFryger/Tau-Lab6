package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;

public class Square extends Quadrangle implements Figure {

	private String name;

	public Square() {

		this.name =  this.getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1);
	}

	public String getName() {
		return name;
	}

	public Boolean canBeCrete(Integer[] sides) {
		if (super.canBeCrete(sides)) {
			return Arrays.stream(sides).allMatch(sides[0]::equals);
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Square{" +
				"name='" + name + '\'' +
				'}';
	}
}
