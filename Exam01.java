
public class Exam01 {

	public static void main(String[] args) {
		// ������ �迭�� ����
		// �ڷ���[][] �迭�� = new �ڷ��� [ù��° ���� ũ��][�ι�° ���� ũ��];
		// 5�� 5���� �迭�����ϱ�

		int[][] arr = new int[5][5];
		// 1.�迭�� �����Ͱ� �����ϱ�
		int num = 1;
		//�Էº�
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = num; //arr[0~5][0~5]: �ڸ��� num�� ����
				num++; //num�� ����
			}
		}
		//��º�
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t"); // \t : ���� ��
			}
			System.out.println();
		}
	}
}
