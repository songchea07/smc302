import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("500이하 자연수를 입력하세요.");
		int num = scan.nextInt();
		int a=0;
		for(int i=0; i<=num;i++){
			if(i%3==0&&!(i%2==0)){
				System.out.println(i);
				a=a+i;
			}
		}
		System.out.println("1~"+num+"까지 3의 배수이면서 홀수 인 수의 합은 "+a+"입니다.");
		
	}

}
