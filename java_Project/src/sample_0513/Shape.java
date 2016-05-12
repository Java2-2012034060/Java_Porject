package sample_0513;

abstract public class Shape {
    protected int x, y;
	public Shape() { x=0; y=0;}
    public Shape(int _x, int _y){
    	x = _x; this.y= _y;
    }
    public void infor() {System.out.println("R x : "+x+" y : "+y);}
    abstract public void move(int _x, int _y); //{this.x+=_x; y +=_y;}
    abstract public void info();
    abstract public void iii();
}
