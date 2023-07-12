import java.util.Scanner;

public class Baitap05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char input;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Ai đang sử dụng máy tính ?");
		input = sc.next().charAt(0);
		
		if (input== 'b' || input == 'B') System.out.print("Xin chào Bố");
		else if (input== 'm' || input == 'M') System.out.print("Xin chào Mẹ");
		else if (input== 'a' || input == 'A') System.out.print("Xin chào Anh");
		else if (input== 'e' || input == 'E') System.out.print("Xin chào Em");
		else System.out.print("Xin chào bạn");

		}
}

