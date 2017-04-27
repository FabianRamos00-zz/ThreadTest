package UI;

import javax.swing.JLabel;

import Logic.Serie;

public class JLabelSerie extends JLabel implements Runnable {

	private Serie serie;
	private double speed;
	
	public JLabelSerie(double speed) {
		super();
		this.speed = speed;
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

	public void run(){
		while (serie.isFinal()) {
			try {
				this.setText("" + serie.next());
				Thread.sleep((long)((1/this.speed)*1000));
			} catch (InterruptedException e) {
			}
		}
	}

}
