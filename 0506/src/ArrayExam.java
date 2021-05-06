import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a [] =new int[5];
		int num=0;
		int b=0;
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"번 입력");
			a[i]= scan.nextInt();
			if(a[i]>num){
				num=a[i];
				b=i+1;
			}
		}
		System.out.println("가장 큰 수는 "+b+"번째 숫자인 "+num);
		
	}

}
