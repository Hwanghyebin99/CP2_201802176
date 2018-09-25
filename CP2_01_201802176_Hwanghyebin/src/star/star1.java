package star;
import java.util.Scanner;
public class star1 {
	public static void main(String[] args) {
		System.out.println("몇개의 줄로 별을 출력할까요?");
		System.out.println("---[1번]---");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		if (line<=0) line=5;
		for (int i=0;i<line;i++) {
			for(int k=i;k>=0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
