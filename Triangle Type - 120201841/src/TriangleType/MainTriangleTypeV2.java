package TriangleType;


public class MainTriangleTypeV2 {
	public static void main(String[] args) {}
	public String triangleType(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0)
			return "Not Valid";
		else if(a>=(b+c) || c>=(b+a) || b>=(a+c))
			return "Not a Triangle";
		else if(a==b && b==c)
			return "Equilateral";
		else if(a!=b && b!=c && c!=a)
			return "Scalene";
		else if(a==b || c==a || c==b)
			return "Isosceles";
		return null;
	}

}
