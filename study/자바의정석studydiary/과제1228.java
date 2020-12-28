package 자바의정석studydiary;

public class 과제1228 {

	public static void main(String[] args) {

		int[] arr = {4,7,1,1,3,7,6,2,4,4,2,8,3,9,2};

		// arr배열 각 값의 갯수만큼 bucket 배열의 안에 담기게 함.	
		int[] bucket = new int[arr.length];
		
		
		// 버킷정렬을 이용하여 각 index가 안에 갯수대로 담기게 함.
		for(int i=0; i<arr.length; i++) {
			bucket[arr[i]]++;
		}
		
		System.out.print("1. 중복제거 = ");
		
		// bucket의 index 값이 아니라 index를 출력시킨다.
		for(int i=0; i<bucket.length; i++) {
			if(bucket[i]!=0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
		System.out.print("2. 정렬 = ");
		
		// bucket의 index 값이 0이 아니면 출력시키고, i가 움직이지 못하도록 i를 미리 빼준다. 그럼 if문 뒤에 i++ 됨.
		for(int i=0; i<bucket.length; i++) {
			if(bucket[i]!=0) {
				System.out.print(i + " ");
				bucket[i]--;
				i--;
			}
		}
		
	}

}
