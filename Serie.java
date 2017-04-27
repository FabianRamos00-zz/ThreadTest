package Logic;

public class Serie {
	
	private int min;
	private int max;
	private int value;
	
	public Serie(int min, int max) {
		super();
		this.min = min;
		this.max = max;
		this.value = min;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	public int next(){
		return this.value++;
	}
	
	public boolean isFinal(){
		return this.value <= this.max;
	}
	
	public void reset(){
		this.value = this.min;
	}
}
