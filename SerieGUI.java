package UI;

import Logic.Serie;

public class SerieGUI implements Runnable{

	private Serie serie;
	private double speed; // v = #/t 
	
	public SerieGUI(double speed){
		this.speed = speed;
	}
	
	public SerieGUI(Serie serie){
		this.serie = serie;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void show(){
		while (serie.isFinal()) {
			System.out.println(" : " + serie.next());
			try {
				Thread.sleep((long)((1/this.speed)*1000));
			} catch (InterruptedException e) {
			}
		}
	}
	
	public void run(){
		show();
	}
}
