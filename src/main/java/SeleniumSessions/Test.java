package SeleniumSessions;

public class Test {

	public static void main(String[] args) {

		String s = "MALABAR";
		String s1 = s;
		for(int i=0; i< s.length(); i++){

			if(s.charAt(i)=='A'){
				int indexA = s.indexOf('A');
				String star = null;
				int rep[] = new int[indexA+1];
					for(int k : rep){
						 star = "*";
						star = star + "*";
					}
				s = s.substring(0, indexA+1).replace("A", star);
				//s = s1;
			}
			
			System.out.println(s);
		}

		
		
//		
//		
//		for(int i=0; i< s.length(); i++){
//			
//			if(s.charAt(i) == 'A'){
//				int index = s.indexOf('A', i);
//				System.out.println(index);
//				//int rep = index+1;
//				int rep[] = new int[index+1];
//				for(int k : rep){
//					String star = "*";
//					star = star+"*";
//					s = s.replace("A", star);
//					break;
//				}
//			}
//			System.out.println(s);
//		}
//		
		
		
		
	}

}
