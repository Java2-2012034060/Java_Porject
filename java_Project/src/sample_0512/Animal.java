package sample_0512;

public class Animal {
	protected double weight;
	protected String picture;
	
	public Animal(){
		weight=99; picture="Animal";
	System.out.println("Animal cont");
		}//자동호출은 아무 인자 없는 생성자를 호출함.
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal cont2");
	}
	void eat() {System.out.println("eat() 호풀되었음");}
	void sleep() {System.out.println("sleep() 호풀되었음");}
	

}
