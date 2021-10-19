public interface Polygon 
{
	double pi=3.14;
	public double circle(double x);
	int rectangle(int x, int y);
	double triangle(double a, double b);
	int square(int s);
	double hexagon(double b);
	public static void main(String[] args) {
		Areas a1= new Areas();
		a1.circle(8);
		a1.rectangle(10,9);
		a1.triangle(3,9);
		a1.square(9);
		a1.hexagon(17);
		
	}
}
class Areas implements Polygon{
	public double circle(double a) {
		System.out.println("area of circle:" +pi*a*a);
		return(pi*a*a);
	}
	public int rectangle(int x, int y) {
		System.out.println("rectangle area:"+x*y);
		return(x*y);		
	}
	public double triangle(double a, double b) {
		System.out.println("area of triangle:"+a*b/2);
		return(a*b/2);
		
	}
	public int square(int s) {
		System.out.println("area of square:" +s*s);
		return(s*s);
		
	}
	public double hexagon(double b) {
		double area=((3*Math.pow(3, 1/3)*Math.pow(b, 2)))/2;
		System.out.println("area of hexagon:" +area);
		return area;
	}
}