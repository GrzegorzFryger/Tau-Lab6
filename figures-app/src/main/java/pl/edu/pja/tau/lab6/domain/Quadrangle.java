package pl.edu.pja.tau.lab6.domain;

import pl.edu.pja.tau.lab6.Figure;

import java.util.Arrays;

public class Quadrangle implements Figure {
	private String name;

	public Quadrangle() {

		this.name =  this.getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1);
	}

	public String getName() {
		return name;
	}

	public Boolean canBeCrete(Integer[] sides) {
		return sides.length == 4;
	}

	@Override
	public String toString() {
		return "Quadrangle{" +
				"name='" + name + '\'' +
				'}';
	}
}
