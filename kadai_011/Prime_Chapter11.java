package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean primNumber [] =new boolean[101];
		
		for(int i = 2; i < primNumber.length; i++) {
			primNumber[i] = true;
		}
		
		for(int i = 2; i < primNumber.length; i++) {
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					primNumber[i] = false;
				}
			}
		}
		
		for(int i = 2; i < primNumber.length; i++) {
			if(primNumber[i]) {
				System.out.println(i);
			}
			
		}		

	}

}
