package Test;

import Logic.Serie;

public class TestSerie {

	/**
	 * @author Fabian N. Ramos C.
	 */
	public static void main(String[] args) {
		Serie serie = new Serie(2, 1000);
		while (serie.isFinal()) {
			System.out.println("" + serie.next());
		}
	}

}
