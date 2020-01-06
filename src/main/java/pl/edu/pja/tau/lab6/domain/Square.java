package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;

public class Square implements Figure {

	private String name;

	public Square() {
		this.name = this.getClass().getName();
	}

	public Boolean canBeCrete(Integer[] sides) {
		if(sides.length < 4 || sides.length > 4 ) {
			return false;
		} else {
			return Arrays.stream(sides).allMatch(sides[0]::equals);
		}

	}

	@Override
	public String toString() {
		return "Square{" +
				"name='" + name + '\'' +
				'}';
	}
}
