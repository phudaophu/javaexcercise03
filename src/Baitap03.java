import java.util.Scanner;

public class Baitap03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int a,b,c,opt; 
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("*** Chuong trinh nhap vao 3 so nguyen - Xuat ra thu tu tang/giam dan ***");
			System.out.print("Nhap vao so nguyen thu nhat: ");
			a = sc.nextInt();
			System.out.print("Nhap vao so nguyen thu hai: ");
			b = sc.nextInt();
			System.out.print("Nhap vao so nguyen thu ba: ");
			c = sc.nextInt();
			System.out.println("--------------- MENU ---------------");
			System.out.println("1. Xuat ket qua theo thu tu tang dan");
			System.out.println("2. Xuat ket qua theo thu tu giam dan");
			System.out.println("------------------------------------");
			System.out.println("");
			System.out.print(">>> Gia tri ban chon la: ");
			opt = sc.nextInt();
			sc.close();
			
			// opt == 1 
			if (opt == 1) {
				
				if      (a >= b && b >= c)  System.out.print("Result: "+ c +"-"+ b +"-"+ a);
				else if (a >= c && c >= b)  System.out.print("Result: "+ b +"-"+ c +"-"+ a);
				else if (b >= a && a >= c)  System.out.print("Result: "+ c +"-"+ a +"-"+ b);
				else if (b >= c && c >= a)  System.out.print("Result: "+ a +"-"+ c +"-"+ b);
				else if (c >= a && a >= b)  System.out.print("Result: "+ b +"-"+ a +"-"+ c);
			    else 						System.out.print("Result: "+ a +"-"+ b +"-"+ c);
			}
			// opt == 2 
			else if (opt == 2) {
				
				if      (a >= b && b >= c)  System.out.print("Result: "+ a +"-"+ b +"-"+ c);
				else if (a >= c && c >= b)  System.out.print("Result: "+ a +"-"+ c +"-"+ b);
				else if (b >= a && a >= c)  System.out.print("Result: "+ b +"-"+ a +"-"+ c);
				else if (b >= c && c >= a)  System.out.print("Result: "+ b +"-"+ c +"-"+ a);
				else if (c >= a && a >= b)  System.out.print("Result: "+ c +"-"+ a +"-"+ b);
			    else 						System.out.print("Result: "+ c +"-"+ b +"-"+ a);
			}
			else {
				System.out.println(">>> Gia tri nhap vao khong co trong menu!");
			}
			
			
		}
		catch(Exception e){
			System.out.println("Gia tri nhap vao phai la so nguyen co gia tri trong khoang -2147483648 to 2147483647!");
		}
	
	}

}
