package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;

public class IsoscelesTriangle implements Figure {
	private String name;

	public IsoscelesTriangle() {
		this.name = this.getClass().getName();
	}

	public Boolean canBeCrete(Integer[] sides) {
		if(sides.length < 3 || sides.length > 3 ) {
			return false;
		} else {
			return Arrays.stream(sides).allMatch(sides[0]::equals) ||
					Arrays.stream(sides).anyMatch(x -> Arrays.asList(sides).contains(x)) ;
		}
	}

	@Override
	public String toString() {
		return "IsoscelesTriangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
