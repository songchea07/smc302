import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("[1: ���� 2: ���� 3: ��]");
		int user = scan.nextInt();
		System.out.println("-------------���� ���� ��---------------");
		game(user,com);
			
		
		
	}
	public static void game(int user, int com) {
		switch (user) {
		case 1: 
			if(com==1) {
				System.out.println("�� :���� ��ǻ�� : ����");
				System.out.println("���º�");
				break;
			}
			else if(com==2) {
				System.out.println("�� :���� ��ǻ�� : ����");
				System.out.println("�����ϴ�");
				break;
			}
			else{
				System.out.println("�� :���� ��ǻ�� : ��");
				System.out.println("�̰���ϴ�");
				break;
			}
		case 2:
			if(com==1) {
				System.out.println("�� :���� ��ǻ�� : ����");
				System.out.println("�̰���ϴ�.");
				break;
			}
			else if(com==2) {
				System.out.println("�� :���� ��ǻ�� : ����");
				System.out.println("���º�");
				break;
			}
			else{
				System.out.println("�� :���� ��ǻ�� : ��");
				System.out.println("�����ϴ�.");
				break;
			}
		case 3:
			if(com==1) {
				System.out.println("�� :�� ��ǻ�� : ����");
				System.out.println("�����ϴ�.");
				break;
			}
			else if(com==2) {
				System.out.println("�� :�� ��ǻ�� : ����");
				System.out.println("�̰���ϴ�.");
				break;
			}
			else{
				System.out.println("�� :�� ��ǻ�� : ��");
				System.out.println("���º�");
				break;
			}
		
	}
}
}
