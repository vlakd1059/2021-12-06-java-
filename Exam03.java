
public class Exam03 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 21;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][(arr[i].length - 1) - j] = num;
				//i열 그대로 
				//j열 [i][4]~[i][0] 순으로 역순으로 값 ++
				num++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
