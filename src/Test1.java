
public class Test1 {

	public static void main(String[] args) {
		/*
		 * 거스름돈 계산
		 * 
		 * N이 32850일 경우
		 * 50000원 : 0개
		 * 10000원 : 3개
		 * 5000원 : 0개
		 * 1000원 : 2개
		 * 500원 : 1개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 0개
		 * 
		 * */
		
		int N = 32850;
		int count = 0;
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i] + "일 경우 : " + N/arr[i]);
			N%=arr[i];
		}
		
		
		
		
	}
	
	
	

}
