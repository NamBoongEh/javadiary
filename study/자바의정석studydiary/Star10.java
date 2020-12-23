package 자바의정석studydiary;

public class Star10 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(!(((i+j<4) && (i<j)) || ((i>j) && (i+j>4)))) {
					System.out.printf("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
