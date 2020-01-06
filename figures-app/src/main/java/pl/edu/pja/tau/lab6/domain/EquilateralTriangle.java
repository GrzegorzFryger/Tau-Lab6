package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;
import java.util.HashSet;

public class EquilateralTriangle extends Triangle implements Figure {
	private String name;

	public EquilateralTriangle() {
		this.name = this.getClass().getName();
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
		return "EquilateralTriangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
