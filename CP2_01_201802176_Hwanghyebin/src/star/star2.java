package star;
import java.util.Scanner;
public class star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 줄로 별을 출력할까요?");
		System.out.println("---[2번]---");
		int line = sc.nextInt();
		if (line<=0) line=5;
		for (int i=0;i<line;i++) {
			for(int k=line;k>i;k--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
