package sample_0519;

public class Class_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_preject[] pob = new P_preject[3];
		pob[0] = new P_preject();
		pob[1] = new C1_object();
		pob[2] = new C2_object();
		
		pr_all(pob[0]); pr_all(pob[1]);pr_all(pob[2]);
		
		pob[0].pr(); pob[1].pr(); pob[2].pr();
		/*for(P_preject temp : pob){
			temp = new P_preject();
			pr_all(temp);
			change_all(temp, 7, 77);
			pr_all(temp);
		}*/
	}
	public static void pr_all(P_preject temp) {temp.pr();}
	public static void change_all(P_preject temp, int x, int y) {
		temp.change(x, y);
	}



}
