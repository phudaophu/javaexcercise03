import java.util.Scanner;

public class Baitap04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input: khai bao bien 
		int a;
		String rs="";
		Scanner sc = new Scanner(System.in);
		
		try {
			// kiem tra xem gia tri nhap vao phai la so nguyen kieu int 
			System.out.println(">>> Chuong trinh nhap vao so nguyen 2 chu so - Xuat ra cach doc <<<");
			System.out.print("Nhap vao so nguyen 2 chu so: ");
			a = sc.nextInt();
			sc.close();
			
			// processing and output 
			if (a < 10 || a > 99) {
				System.out.print(">>> So nguyen nhap vao ko dung yeu cau!");
			}
			else if (a >=10 && a<=19) {
				
				if   (a == 10) rs = "Mười";
				else rs = "Mười"+ NumberByWord(a%2);
				System.out.print(">>> So ban nhap vao la: "+rs);
			}
			else if (a%10 == 0) { 
				rs = NumberByWord(a/10) + " Mươi";
				System.out.print(">>> So ban nhap vao la: "+rs);
			}
			else if (a%10 == 1) {
				rs = NumberByWord(a/10) + " Mươi" + " Mốt";
				System.out.print(">>> So ban nhap vao la: "+rs);
			}
			else {
				rs = NumberByWord(a/10) + " Mươi" + NumberByWord(a%10);
				System.out.print(">>> So ban nhap vao la: "+rs);
			}
		}
		catch(Exception e){
			System.out.print("Gia tri nhap vao phai la so nguyen co gia tri trong khoang -2147483648 to 2147483647!");
		}

	}
	
	// tạo function input: số kiểu int 1 chữ số, output là chữ 
	public static String NumberByWord(int a) {
		if (a >= 0 && a< 10) {
			if      (a == 1 ) return " Một";
			else if (a == 2)  return " Hai";
			else if (a == 3)  return " Ba";
			else if (a == 4)  return " Bốn";
			else if (a == 5)  return " Năm";
			else if (a == 6)  return " Sáu";
			else if (a == 7)  return " Bảy";
			else if (a == 8)  return " Tám";
			else if (a == 9)  return " Chín";
			else return  " Không";
		}
		else return  "Error";
	}
		
}
