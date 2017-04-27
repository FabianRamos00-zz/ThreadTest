package Test;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logic.Serie;
import UI.JLabelSerie;

public class TestJLabelSerie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Series");
		jFrame.setSize(800, 600);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
		JLabelSerie[] jLabelSeries = new JLabelSerie[10];
		for (int i = 0; i < jLabelSeries.length; i++) {
			jLabelSeries[i] = new JLabelSerie(10.0+i+5);
			jLabelSeries[i].setSerie(new Serie(3,1000));
			jPanel.add(jLabelSeries[i]);
			new Thread(jLabelSeries[i]).start();
		}
		jFrame.add(jPanel);
		jFrame.setVisible(true);
		for (int i = 0; i < jLabelSeries.length; i++) {
			new Thread(jLabelSeries[i]).start();
		}
	}

}
