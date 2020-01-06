package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;
import java.util.HashSet;

public class EquilateralTriangle implements Figure {
	private String name;

	public EquilateralTriangle() {
		this.name = this.getClass().getName();
	}

	public Boolean canBeCrete(Integer[] sides) {
		if(sides.length < 3 || sides.length > 3 ) {
			return false;
		} else {
			return Arrays.stream(sides).allMatch(sides[0]::equals);
		}
	}

	@Override
	public String toString() {
		return "EquilateralTriangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
