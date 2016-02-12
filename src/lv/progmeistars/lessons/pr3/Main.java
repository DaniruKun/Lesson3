package lv.progmeistars.lessons.pr3;

public class Main {
	public static void main(String[] args){
		int f1a,f1b,f1c;
		int f2a,f2b,f2c;
		//TODO:modify to read from args, if 0 dimensions are filled its point, 1-line,2-rectangle,3-cube
		f1a = 5; f1b = 3; f1c = 8;
		f2a = 10; f2b = 5; f2c = 7;
		//First check figure 1
		if (f1a == 0 && f1b ==0 && f1c == 0) {
			Point p1 = new Point(0,0,0); //define point
			if (p1.fits(p2)) {
				
			}
		}
		if ((f1a == 0 && f1b == 0) || (f1b == 0 && f1c == 0) || (f1a == 0 && f1c == 0) ){
			Line l1 = new Line(f1a, f1b, f1c); //define line
			if (l1.fits(l2)){
				System.out.println("Line " + l1.toString() + " fits " + l2.toString()); //override toString if you want
			}
		}
		
		if ((f1a == 0 || f1b == 0 || f1c == 0)) {
			Rectangle r1 = new Rectangle(f1a, f1b,f1c);
		}
		
		Rectangle r1 = new Rectangle(f1a, f1b, f1c);
		//check figure 2
		
	}
}