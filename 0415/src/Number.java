import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] random = new int[10];
		boolean b=false;
		
		
		System.out.println("10���� ���� ���� �� �ϳ��� ���纸����(1~50����)");
		int a=scan.nextInt();
		
		for(int i=0;i<10;i++) {
			random[i] = (int)(Math.random()*50)+1;
}
		
		
		for(int i=0;i<10;i++) {
			
			System.out.print(random[i]+" ");
			if(random[i]==a) {
				b=true;
			}
		}
		System.out.println();
		if(b==true) {
			System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
		}                        
		else 
			System.out.println("��! ��ġ�ϴ� ���ڰ� �����ϴ�.");
	}
		


}
