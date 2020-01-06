package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;

public class IsoscelesTriangle extends Triangle implements Figure {
	private String name;

	public IsoscelesTriangle() {
		this.name = this.getClass().getName();
	}

	public String getName() {
		return name;
	}

	public Boolean canBeCrete(Integer[] sides) {
		if (super.canBeCrete(sides)) {
			return Arrays.stream(sides).allMatch(sides[0]::equals) ||
					Arrays.stream(sides).anyMatch(x -> Arrays.asList(sides).contains(x));
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "IsoscelesTriangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
