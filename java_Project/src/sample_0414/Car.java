package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	public void setMan(int man){
		this.man = man;
	}
	public int getMan(){
		return man;
	}
	public void all_setting(int tire, String color){
		this.tire = 4;
		this.color = "white";
	}
	void pr(){
		System.out.println("man : "+ man + "tire : "+ tire + "color : " + color);
	}
	public Car(int man, int tire, String color){
		this.man = man; this.tire = tire; this.color = color;
		}
	public Car(){
		this(4, 4, "red");
	}
	
	//{man = 4; tire = 4; color = "red";}
}
