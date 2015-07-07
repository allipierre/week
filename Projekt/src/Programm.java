
public class Programm {

	public static void main(String[] args) {
		System.out.println(invers("LEXIKON"));

	}
	
	public static String invers(String s){
		String t="";
		for(int i=s.length()-1;i>=0;i--){
			t=t+s.charAt(i);
		}
		return t;
		
	}

}
