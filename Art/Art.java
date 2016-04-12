//This is is a rough draft
public class Art {
	public static void main(String args[]){
		//int n = Integer.parseInt(args[0]);
		//drawart(0.5,0.0,0.5,n);
		filledSquare(0.5,0.5,0.1);
		}
	//base triangle 
	public static void filledSquare(double x, double y, double r) {
		
        
        StdDraw.filledSquare(x,y,r);

	} 

	/*public static void drawart(double x, double y, double r, int n){
		//draws base rectangle 
		filledSquare(x,y,len);
		//base case 
		if (n <= 1) {
		return;	
		}
		//recursive case 
		else {
			
		drawArt(,r/2,n-1);
		drawArt(,r/2,n-1);
		drawArt(,r/2,n-1);
		drawArt(,r/2,n-1);
		}
		
	}*/
}
	