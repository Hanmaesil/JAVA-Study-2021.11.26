
public class Exam01 {

	public static void main(String[] args) {

		// 2���� �迭 : �迭�� �� �ε����� �ٸ� �迭�� �ִ� ��.

		int[][] numArray = new int[3][5]; // ���̰� 3�� ������ �ε������� ���̰� 5�� �迭�� ����.

//		int k = 1;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 5; j++) {
//				numArray[i][j] = k;
//				k++;
//			}
//		}
		// numArray[0].length : 0 �ε����� 5�� ¥�� �迭�� �ֱ⶧���� �̷��� ǥ���ϸ� 0 �ȿ� �ִ� �迭�� �ּҸ� �ǹ��ϸ� ���̴�
		// 5�̴�.2

		// �Էº�
		int k = 1;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i].length; j++) {
				numArray[i][j] = k;
				k++;
				System.out.print(numArray[i][j] + " ");
			}
			System.out.println();
		}

		// ��º�
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
