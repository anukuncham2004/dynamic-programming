import java.util.Scanner;
public class Fabbanaci {
	public static void main(String [] args) {
		int n, a =0, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		n = sc.nextInt();
		System.out.print("Fabbinaci series: ");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int c= a + b;
			a = b;
			b = c;
		}
	}
}