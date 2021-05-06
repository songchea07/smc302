
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle T = new Triangle(10.2,17.3);
		
		System.out.println(T.area());
		T.set(7.5,9.2);
		System.out.println(T.area());
	}

}
class Triangle{
	double wid;
	double hei;
	public Triangle(double wid,double hei){
		this.hei=hei;
		this.wid=wid;
	}
	public void set(double wid,double hei) { 
		this.hei=hei;
		this.wid=wid; }
	public double area(){
		return hei*wid*0.5;
	}
}