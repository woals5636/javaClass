package days11;

import java.util.Arrays;



public class Test {
	public static void main(String[] args) {
		
//		int [] arr = {3,4,2,1,5};
//		int n =3;
//		binarySearch(arr,n);
//		bubbleSearch(arr);

		//3.  int [] m = {1,2,3}
	//   위의 배열에 1번째 인덱스에 4를 삽입하는 코딩을 하세요.

//		int [] m = {1,2,3};
//		// System.arrayCopy();
//		int [] n = new int[m.length+1];
//		int index = 1;
//		System.arraycopy(m, 1, n, index+1, m.length-1);
//		n[index] = 4;
//		System.out.println(Arrays.toString(n));
		
//		4. 1차원 배열을 2차원 배열로 변환
//		   int [] m = {1,2,3,4,5,6};
//		   int [][] n = new int[2][3];    
		
		int [] m = {1,2,3,4,5,6};
		
		int [][] arr = new int [2][3];
		
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = m[row+column];				
			}
		}
		System.out.println(Arrays.toString(arr));
		
//	      int [] m = {1,2,3,4,5,6};
//	      int [][] n = new int[2][3];
//
//	      // i=0              0 0
//	      // i=1              0 1
//	      // i=2              0 2
//	      // i=3              1 0
//	      // i=4              1 1
//	      // i=5              1 2		-> 열값 = i값을 열의 길이로 나눈 나머지 ( 0,1,2,0,1,2 )
//	      for (int i = 0; i < m.length; i++) {
//	         System.out.printf("%d - [%d][%d] \n"
//	               , i, i/(n[0].length), i%(n[0].length));
//	         n[i/n[0].length][i%n[0].length] = m[i];
//	      }
//	      //
//	      for (int i = 0; i < n.length; i++) {
//	         System.out.println(Arrays.toString(n[i]));
//	      }
	}// main
	
	//2. 버블정렬하는 bubbleSearch 메서드 선언
	//
//	private static void bubbleSearch(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length-(i+1); j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
//	}
	
	//1. 이진 검색하는 binarySearch 메서드 선언
	//
//	private static void binarySearch(int arr[], int n) {
//		int top = arr.length - 1;
//		int bot = 0;
//		int mid;
//		
//		while(top >= bot) {
//			mid = (bot+top)/2;
//			if(n > mid) {
//				System.out.println(mid+1);
//			}else if(n < mid) {
//				System.out.println(mid-1);
//			}else {
//				System.out.println(mid);
//			}
//		}
//	}
}// class
