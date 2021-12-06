
public class Exam01 {

	public static void main(String[] args) {
		// 이차원 배열의 생성
		// 자료형[][] 배열명 = new 자료형 [첫번째 방의 크기][두번째 방의 크기];
		// 5행 5열의 배열생성하기

		int[][] arr = new int[5][5];
		// 1.배열에 데이터값 저장하기
		int num = 1;
		//입력부
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = num; //arr[0~5][0~5]: 자리에 num값 대입
				num++; //num값 증가
			}
		}
		//출력부
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t"); // \t : 수평 탭
			}
			System.out.println();
		}
	}
}
