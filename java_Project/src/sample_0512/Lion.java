package sample_0512;

public class Lion extends Animal {
	private int legs;
	public Lion() {
		super(100, "King");//부모 생성자 호출 명시적호출, 값 넣으니  값들어가는 생성자 호출
		this.legs = 4;
	}
	void roar(){System.out.println("roar()가 호출되었음");}
	void infor(){System.out.println(weight+" "+picture);}

}
