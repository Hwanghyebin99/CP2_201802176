package star;
import java.util.Scanner;
public class star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� �ٷ� ���� ����ұ��?");
		System.out.println("---[2��]---");
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
