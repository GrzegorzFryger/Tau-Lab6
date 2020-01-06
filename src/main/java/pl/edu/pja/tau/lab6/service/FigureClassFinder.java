package pl.edu.pja.tau.lab6.service;

import pl.edu.pja.tau.lab6.Figure;
import pl.edu.pja.tau.lab6.domain.*;

import java.util.Set;

public class FigureClassFinder {
	public static Set<Figure> initializeAllClasses() {
		return Set.of(new Triangle(),
				new Square(),
				new Rectangle(),
				new Quadrangle(),
				new IsoscelesTriangle(),
				new EquilateralTriangle()
		);
	}
}

