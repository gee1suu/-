#include <stdio.h>
int main() {
	int n;
	int ans = 0;
	int count = 0;
	
	scanf("%d", &n);
	int s = n;
	
	// N의 자릿수(count) 구하기
	while(s != 0) {
		s /= 10;
		++count;
	}

	// n - 9 * count부터 n까지에서 생성자 찾기
	for(int i = n - 9 * count; i < n; i++) {
		int num = i;
		int sum = 0;
		
		// i의 분해합 구하기
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}

		// i의 분해합이 n이면 반복문 종료
		if(sum + i == n) {
			ans = i;
			break;
		}
	}
	
	printf("%d", ans);
}