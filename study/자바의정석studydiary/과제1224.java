package 자바의정석studydiary;

public class 과제1224 {

	public static void main(String[] args) {

		for(int i=1; i<=9; i++) {
			if(i%3==0) {
				System.out.printf("%d.\t%d\t%d\n", i, 3, (int)Math.ceil(i/3.0));
			}
			else {
				System.out.printf("%d.\t%d\t%d\n", i, i%3, (int)Math.ceil(i/3.0));
			}
		}
	}

}