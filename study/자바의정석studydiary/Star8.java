package 자바의정석studydiary;

public class Star8 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int k=4-i; k>0; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
