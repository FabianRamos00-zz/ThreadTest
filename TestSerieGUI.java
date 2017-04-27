package Test;

import UI.SerieGUI;
import Logic.Serie;

public class TestSerieGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Serie serie = new Serie(3, 100); // Logica....
		Serie serie2 = new Serie(300, 395);
		SerieGUI serieGUI = new SerieGUI(50.0); // Vista....
		SerieGUI serieGUI2 = new SerieGUI(50.0);
		System.out.println("" + Thread.currentThread().getName());
		serieGUI.setSerie(serie);
		serieGUI2.setSerie(serie2);
		Thread thread = new Thread(serieGUI);
		thread.start(); // control
		new Thread(serieGUI2).start();
		System.out.println("Hilos lanzados....");
	}

}
