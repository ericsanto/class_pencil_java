package Aula02;

public class Caneta {
	private String model;
	private String color;
	private float tip;
	private int load;
	private boolean cover;
	
	
	public Caneta(String model, String color, float tip, int load, boolean cover) {
		setModel(model);
		setColor(color);
		setTip(tip);
		setLoad(load);
		setCover(cover);
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public float getTip() {
		return tip;
	}
	
	public int getLoad() {
		
		if(load < 0) {
			throw new  IllegalArgumentException("A carga não pode ser negativa!");
		}
		
		return load;
	}
	
	public boolean getCover() {
		
		if(cover == false) {
			throw new  IllegalArgumentException("A caneta está tampada");
		}
		return cover;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setTip(float tip) {
		this.tip = tip;
	}
	
	public void setLoad(int load) {
		this.load = load;
	}
	
	public void setCover(boolean cover) {
		this.cover = cover;
	}
	
	public void writer(String data) {
		if(getCover() == true && getLoad() > 0 ) {
			System.out.println(data);
		}
	}
	
}
