import java.util.Scanner;

public class Exam04 {
	// Main �޼ҵ�
	public static void main(String[] args) {
		// Ŭ������ ���� ��ġ�� �޼ҵ带 ������ ���
		// �� static Ű���� �ٿ������.

		// 1. �޼ҵ��� ����
		// - ���� ������ : public
		// - ���� Ÿ�� : �޼ҵ� ���� ���� ��������� ���ƿ��� �����Ϳ� ���� Ÿ��
		// - �޼ҵ��� �̸�
		// - �޼ҵ尡 ����� X�� -> �޼ҵ� �ް����� -> (�ް�����) �Ұ�ȣ �ȿ� �� ����.

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int n1 = sc.nextInt();

		System.out.print("�ι�° ���� : ");
		int n2 = sc.nextInt();

		int result = addNumber(n1, n2);
		System.out.println("���� : " + result);

		// �޼ҵ�� ũ�� �޼ҵ� ȣ��� �޼ҵ� ���Ƿ� �۾��� �����.
	}// main() ������ �κ�

	// ���Ӱ� �޼ҵ带 ����� �ִ� ����
	// ���� ������ public -> ����/�ܺ� ��𼭵� ������ ������ ������
	public static int addNumber(int x1, int x2) {

		int result = x1 + x2;

		return result;
	}

}
// class ������ �κ�
