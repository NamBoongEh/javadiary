package 자바의정석studydiary;

public class Star10 {

	public static void main(String[] args) {

		for(int i=0; i<2; i++) {		
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			for(int j=(2-i)*2-1; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("*****");
		
		for(int i=0; i<2; i++) {		
			for(int k=i; k<2; k++) {
				System.out.print("*");
			}
			
			for(int j=0; j<i*2+1; j++) {
				System.out.print(" ");
			}
			
			for(int k=2; k>i; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
