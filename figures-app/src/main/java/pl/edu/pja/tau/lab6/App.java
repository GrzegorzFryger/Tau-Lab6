package pl.edu.pja.tau.lab6;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import static pl.edu.pja.tau.lab6.service.FigureClassFinder.initializeAllClasses;

public class App {
	public static void  main(String[] args) {
		AtomicInteger elements = new AtomicInteger();
		System.out.println("Can you build figure form sides?");
		Integer[] param = Arrays.stream(args).map(Integer::valueOf).toArray(Integer[]::new);

		if ( param.length < 3 || param.length > 4 ) {
			initializeAllClasses().forEach(x -> {
				if (x.canBeCrete(param)) {
					elements.getAndIncrement();
					System.out.println("Can create figure : " + x.getName());
				}
			});

			if(elements.get() == 0) {
				System.out.println("Can not create figure ");
			}
		} else {
			System.out.println("Input must be 3 or 4 length");
		}


	}

}
