package 자바의정석studydiary;

public class 과제1224 {

	public static void main(String[] args) {

		for(int i=1; i<10; i++) {
			System.out.printf("%d.\t%d\t%d\n", i, (i-1)%3+1, (int)Math.ceil(i/3.0));
		}
	}

}