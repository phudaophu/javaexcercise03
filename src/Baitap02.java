import java.util.Scanner;

public class Baitap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c; 
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(">>> Chuong trinh nhap vao 3 so nguyen - Xuat ra thu tu tang dan <<<");
			System.out.print("Nhap vao so nguyen thu nhat: ");
			a = sc.nextInt();
			System.out.print("Nhap vao so nguyen thu hai: ");
			b = sc.nextInt();
			System.out.print("Nhap vao so nguyen thu ba: ");
			c = sc.nextInt();
			sc.close();
			
//			if (a > b && a > c) {
//				System.out.print("So nguyen lon nhat la: "+a);
//			}
//			else if (a== b) {
//				System.out.print("Hai so co gia tri bang nhau: "+a);
//			}
//			else {
//				System.out.print("So nguyen lon nhat la: "+b);
//			}
			
			if      (a >= b && b >= c)  System.out.print("Result: "+ c +"-"+ b +"-"+ a);
			else if (a >= c && c >= b)  System.out.print("Result: "+ b +"-"+ c +"-"+ a);
			else if (b >= a && a >= c)  System.out.print("Result: "+ c +"-"+ a +"-"+ b);
			else if (b >= c && c >= a)  System.out.print("Result: "+ a +"-"+ c +"-"+ b);
			else if (c >= a && a >= b)  System.out.print("Result: "+ b +"-"+ a +"-"+ c);
//		    else if (c > b && b >= a)   System.out.print( a +"-"+ b +"-"+ c);
		    else 						System.out.print("Result: "+ a +"-"+ b +"-"+ c);
//			else if (a == b && b > c)  System.out.print( c +"-"+ b +"-"+ a);
//			abc 
//			acb
//			bac .
//			bca
//			cab .
//			cba .
			
			
		}
		catch(Exception e){
			System.out.print("Gia tri nhap vao phai la so nguyen co gia tri trong khoang -2147483648 to 2147483647!");
		}
	
		
	}

}
