package 자바의정석studydiary;

public class Star8 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				if((j<4 && i+j<4) || (j>4 && j-i>4)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
  