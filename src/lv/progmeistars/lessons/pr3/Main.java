package lv.progmeistars.lessons.pr3;

public class Main {
	public static void main(String[] args){
		int f1a,f1b,f1c;
		int f2a,f2b,f2c;
		//TODO:modify to read from args, if 0 dimensions are filled its point, 1-line,2-rectangle,3-cube
		f1a = 5;
		f2a = 10;
		Line l1=new Line(f1a);
		Line l2 = new Line(f2a);
		if (l1.fits(l2)){
			System.out.println("Line " + l1.toString() + " fits " + l2.toString()); //override toString if you want
		}
	}
}
