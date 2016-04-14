package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television(7, 10, true);
		myTv.pr();
		Television yourTv = new Television(11, 20, true);
		yourTv.pr();
		Television goodTv = new Television();
		goodTv.pr();
		Television ggTv = new Television(20, 140);
		ggTv.pr();
	}

}
