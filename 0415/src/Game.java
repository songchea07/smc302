import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("[1: 가위 2: 바위 3: 보]");
		int user = scan.nextInt();
		System.out.println("-------------가위 바위 보---------------");
		game(user,com);
			
		
		
	}
	public static void game(int user, int com) {
		switch (user) {
		case 1: 
			if(com==1) {
				System.out.println("나 :가위 컴퓨터 : 가위");
				System.out.println("무승부");
				break;
			}
			else if(com==2) {
				System.out.println("나 :가위 컴퓨터 : 바위");
				System.out.println("졌습니다");
				break;
			}
			else{
				System.out.println("나 :가위 컴퓨터 : 보");
				System.out.println("이겼습니다");
				break;
			}
		case 2:
			if(com==1) {
				System.out.println("나 :바위 컴퓨터 : 가위");
				System.out.println("이겼습니다.");
				break;
			}
			else if(com==2) {
				System.out.println("나 :바위 컴퓨터 : 바위");
				System.out.println("무승부");
				break;
			}
			else{
				System.out.println("나 :바위 컴퓨터 : 보");
				System.out.println("졌습니다.");
				break;
			}
		case 3:
			if(com==1) {
				System.out.println("나 :보 컴퓨터 : 가위");
				System.out.println("졌습니다.");
				break;
			}
			else if(com==2) {
				System.out.println("나 :보 컴퓨터 : 바위");
				System.out.println("이겼습니다.");
				break;
			}
			else{
				System.out.println("나 :보 컴퓨터 : 보");
				System.out.println("무승부");
				break;
			}
		
	}
}
}
