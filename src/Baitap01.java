import java.util.Scanner;

public class Baitap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(">>> Chuong trinh nhap vao 2 so nguyen - Xuat ra so nguyen lon nhat <<<");
			System.out.print("Nhap vao so nguyen thu nhat: ");
			a = sc.nextInt();
			System.out.print("Nhap vao so nguyen thu hai: ");
			b = sc.nextInt();
			sc.close();
			if (a > b) {
				System.out.print("So nguyen lon nhat la: "+a);
			}
			else if (a== b) {
				System.out.print("Hai so co gia tri bang nhau: "+a);
			}
			else {
				System.out.print("So nguyen lon nhat la: "+b);
			}
		}
		catch(Exception e){
			System.out.print("Gia tri nhap vao phai la so nguyen co gia tri trong khoang -2147483648 to 2147483647!");
		}

	}

}
