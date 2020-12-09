import java.util.Arrays;

class test {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수" + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
		
		System.out.printf("출력 테스트 %n123%n");
		
		String a = "abcde";
		System.out.println(a.toCharArray());
		
		int[] arr = {3,2,0,1};
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
	}
}
