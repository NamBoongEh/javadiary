package 자바의정석studydiary;

public class Star9 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<3) {
					if(i<=j && j<5-i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if(j<=i && 4-i<=j) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
