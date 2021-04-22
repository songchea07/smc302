import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		
		Grade g = new Grade();
		System.out.println("평균은 "+g.average(math,science,english));
		
		
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average(int math,int science,int english) {
		return (math+science+english)/3;
		
	}
}