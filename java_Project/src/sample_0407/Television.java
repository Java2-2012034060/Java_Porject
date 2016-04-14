package sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
    public Television(){
    	this(10, 20, false);
			//channel = 10;
			//volume = 10;
			//onOff = true;
	}//메서드 오버로딩
    public Television(int channel, int volume){
    	this(channel, volume, true);
    }
	void pr(){
		System.out.println(channel+ " "+volume+ " "+onOff);
	}
   
}
