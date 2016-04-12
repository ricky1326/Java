
public class Sierpinski{
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		drawSierpinski(0.5,0.0,0.5,n);
		}
	//base triangle 
	public static void filledTriangle(double x, double y, double len){
		double a[] = {x,x+(len/2),x-(len/2)};
		double b[] = {y,y+Math.sqrt(3)*len/2,y+Math.sqrt(3)*len/2};	
		StdDraw.filledPolygon(a,b);
	} 

	public static void drawSierpinski(double x, double y, double len, int n){
		//draws base triangle 
		filledTriangle(x,y,len);
		//base case 
		if (n <= 1) {
		return;	
		}
		//recursive case 
		else {
		double rec = len/2;	
		drawSierpinski(x-(len/2),y,len/2,n - 1);
		drawSierpinski(x+(len/2),y,len/2,n - 1);
		drawSierpinski(x,y+Math.sqrt((len*len)-(rec * rec)),len/2, n - 1);
		}
		
	}
} 
	