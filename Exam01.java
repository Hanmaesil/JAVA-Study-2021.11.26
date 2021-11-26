
public class Exam01 {

	public static void main(String[] args) {

		// 2차원 배열 : 배열의 한 인덱스에 다른 배열을 넣는 것.

		int[][] numArray = new int[3][5]; // 길이가 3인 변수의 인덱스마다 길이가 5인 배열이 들어간다.

//		int k = 1;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 5; j++) {
//				numArray[i][j] = k;
//				k++;
//			}
//		}
		// numArray[0].length : 0 인덱스에 5개 짜리 배열이 있기때문에 이렇게 표현하면 0 안에 있는 배열의 주소를 의미하며 길이는
		// 5이다.2

		// 입력부
		int k = 1;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i].length; j++) {
				numArray[i][j] = k;
				k++;
				System.out.print(numArray[i][j] + " ");
			}
			System.out.println();
		}

		// 출력부
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i].length; j++) {
				System.out.print(numArray[i][j] + " ");

			}System.out.println();
		}


//	int [][] ary = new int[5][3];

	// ary[2]= 2;
//	ary[2][1]=3;
//
//	System.out.println(ary[2][1]);

}

}
