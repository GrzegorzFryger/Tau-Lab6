package pl.edu.pja.tau.lab6.service;

import org.reflections.Reflections;
import pl.edu.pja.tau.lab6.Figure;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.stream.Collectors;

public class FigureClassFinder {

	public static Set<Class<? extends Figure>> getAllClasses() {
		Reflections reflections = new Reflections("pl.edu.pja.tau.lab6");
		return reflections.getSubTypesOf(Figure.class);
	}

	public static Set<Figure> initializeAllClasses() {
		return getAllClasses().stream().map(c -> {
			try {
				return (Figure) c.getDeclaredConstructor().newInstance();
			} catch (InstantiationException | InvocationTargetException | NoSuchMethodException |
					IllegalAccessException e ) {
				System.out.println("Error");
				return null;
			}
		}).collect(Collectors.toSet());
	}
}

