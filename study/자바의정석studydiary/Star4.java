package 자바의정석studydiary;

public class Star4 {

	public static void main(String[] args) {

		for(int i=0; i<2; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=3-i; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
		
		System.out.println("  *");
		
		for(int i=0; i<2; i++) {
			
			for(int j=1-i; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=0; j<i*2+1; j++) {
				System.out.print(" ");
			}
			System.out.print("*\n");

		}
		
	}

}
