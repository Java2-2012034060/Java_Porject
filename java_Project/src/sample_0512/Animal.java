package sample_0512;

public class Animal {
	protected double weight;
	protected String picture;
	
	public Animal(){
		weight=99; picture="Animal";
	System.out.println("Animal cont");
		}//�ڵ�ȣ���� �ƹ� ���� ���� �����ڸ� ȣ����.
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal cont2");
	}
	void eat() {System.out.println("eat() ȣǮ�Ǿ���");}
	void sleep() {System.out.println("sleep() ȣǮ�Ǿ���");}
	

}
