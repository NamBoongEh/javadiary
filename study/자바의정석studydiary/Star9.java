package 자바의정석studydiary;

public class Star9 {

	public static void main(String[] args) {

		for(int i=0; i<3; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=5; j>i*2; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=0; i<2; i++) {
			for(int k=1-i; k>0; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=(i+1)*2; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
