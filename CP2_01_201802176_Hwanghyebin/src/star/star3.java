package star;
import java.util.Scanner;
public class star3 {
	public static void main(String args[]) {
		System.out.println("��� �ٷ� ���� ����ұ��?");
		System.out.println("---[3��]---");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		if (line<=0) line=9;
		while (line%2==0) {
			System.out.println("Ȧ���� �ٽ� �Է� �� �ּ���.");
			line = sc.nextInt();
		}
		int k,i;
		for(i=1;i<=line;i+=2) {
			for( k = line-i;k>=1;k-=2)
				System.out.print(" ");
			for( k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		for(i=(line-2);i>=1;i-=2) {
			for(k=1;k<=(line-i);k+=2)
				System.out.print(" ");
			for(k=i;k>=1;k--)
				System.out.print("*");
			System.out.println();
			
		}
	}

}
