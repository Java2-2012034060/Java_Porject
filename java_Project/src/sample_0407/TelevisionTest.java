package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		
		myTv.channel = 18;
		myTv.volume = 12;
		myTv.onOff = true;
				
		
		System.out.println("current channel : " + myTv.changeChannel(24));
		
		myTv.pr();
		
      

	}

}
