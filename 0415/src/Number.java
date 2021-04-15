import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//선언부
		Scanner scan = new Scanner(System.in);
		int[] random = new int[10];
		boolean b=false;
		
		
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지)");
		int a=scan.nextInt(); //스캐너로 입력받기
		
		for(int i=0;i<10;i++) { //배열에 math함수로 랜덤값 넣기
			random[i] = (int)(Math.random()*50)+1;
		}
		
		
		for(int i=0;i<10;i++) {	 //배열 출력과 입력값과 일치하는지 조건문으로 확인
			System.out.print(random[i]+" ");
			if(random[i]==a) {
				b=true;
			}
		}
		
		//출력부
		System.out.println();
		if(b==true) {
			System.out.println("당첨! 일치하는 숫자가 있습니다.");
		}                        
		else 
			System.out.println("꽝! 일치하는 숫자가 없습니다.");
	}
		


}
