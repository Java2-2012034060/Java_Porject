package sample_0512;

public class Eagle extends Animal {
	private int wings=4;
	public Eagle(){System.out.println("Eagle cont");}
	void fly(){System.out.println("fly()가 호출되었음");}
	void eat(){ System.out.println("Eagle eat");}//메소드 오버라이딩

}
