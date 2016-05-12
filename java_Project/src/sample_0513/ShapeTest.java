package sample_0513;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r1 = new Rectangle();
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();
		r1.move(99,99);
		c1.move(99,99);
		infor(r1);
		infor(c1);

	}
    static void infor(Shape ro) {ro.info(); ro.iii();}//Shape 함수 하나 이지만 알아서 Rectangle 로 인식함
    static void infor(Circle c) {c.info();}
    static void inforrr(Rectangle r) {r.info();}//자식이 30개라면 메소드 30개 짜야됨....
}
