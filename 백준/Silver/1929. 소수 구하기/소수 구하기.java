import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		boolean[] prime = new boolean[n + 1];
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(!prime[i]) System.out.println(i);
		}
		
		scanner.close();
	}
}