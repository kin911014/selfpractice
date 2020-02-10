package ex1;

public class BubleSortEx01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		int temp = 0;
		int cnt = arr.length;
		
		System.out.println("========정렬전=========");
		for(int i=0; i<cnt; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<cnt; i++) {
			for(int j = 0 ; j < cnt - 1; j++ ) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\n=======정렬후=======");
		for(int k=0; k<cnt; k++){
			System.out.print(arr[k] + " ");
		}
				

	}
}
