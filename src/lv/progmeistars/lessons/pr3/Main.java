package lv.progmeistars.lessons.pr3;

public class Main {
	public static void main(String[] args){
		int[] f1 = new int[3];
		int[] f2 = new int[3];
		int c = 0; //counter ofr number of zeros in entered arguments
		//TODO:modify to read from args, if 0 dimensions are filled its point, 1-line,2-rectangle,3-cube
		for (int i = 0; i < 3; i++) {
			f1[i] = Integer.parseInt(args[i]);
			if (f1[i] == 0) {
				c++;
			}
		}
			switch (c) {
			case 0: Paralelipiped p1 = new Paralelipiped(f1[0], f1[1], f1[2]);
				break;
			case 1: Rectangle r1 = new Rectangle(f1[0], f1[1], f1[2]);
				break;
			case 2: Line l1 = new Line(f1[0], f1[1], f1[2]);
				break;
			case 3: Point po1 = new Point(f1[0], f1[1], f1[2]);
				break;
			}
			
		c = 0;
		for (int i = 0; i < 3; i++) {
			f2[i] = Integer.parseInt(args[i]);
			if (f2[i] == 0) {
				c++;
			}
			
		}
		
		switch (c) {
		case 0: Paralelipiped p2 = new Paralelipiped(f2[0], f2[1], f2[2]);
			break;
		case 1: Rectangle r2 = new Rectangle(f2[0], f2[1], f2[2]);
			break;
		case 2: Line l2 = new Line(f2[0], f2[1], f2[2]);
			break;
		case 3: Point po2 = new Point(f2[0], f2[1], f2[2]);
			break;
		}
		
			if (l1.fits(l2)){
				System.out.println("Line " + l1.toString() + " fits " + l2.toString()); //override toString if you want
			}
		}
		
	
		
	}
}