package SeleniumSessions;

import java.util.ArrayList;

public class Div {

	public static void main(String[] args) {

//		int ar[] = {1,2,3,4,5,6,7,8,9};
//		Object ob[] = new Object[ar.length];
//		for(int i=0; i<ar.length; i++){
//			ob[i] = ar[i];
//			if(ar[i]%3==0){
//				ob[i]="hi";
//			}
//		}
//		
//		for(int i=0; i<ob.length; i++){
//			System.out.print(ob[i]);
//		}
		
		ArrayList<Object> ar1 = new ArrayList<Object>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		ar1.add(6);
		ar1.add(7);
		ar1.add(8);
		ar1.add(9);

		
		for(int i=0; i< ar1.size(); i++){
			if((Integer)ar1.get(i) % 3 == 0){
				ar1.remove(i);
				ar1.add(i, "hi");
			}
		}
		
		System.out.println(ar1);
		
	}

}
