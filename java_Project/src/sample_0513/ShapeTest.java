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
    static void infor(Shape ro) {ro.info(); ro.iii();}//Shape �Լ� �ϳ� ������ �˾Ƽ� Rectangle �� �ν���
    static void infor(Circle c) {c.info();}
    static void inforrr(Rectangle r) {r.info();}//�ڽ��� 30����� �޼ҵ� 30�� ¥�ߵ�....
}
