package arrayQuestions;

public class Solution {

	public long solution(int[] A) {
		
		long minValue = Long.MAX_VALUE;
		long sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = 0;
			for (int j = 0; j < A.length; j++) {
				if (i > j) {

				} else {
					if (i == j) {

						sum = sum + A[i];

					} else if (i < j) {
						sum = sum + A[j];
					}

					if (Math.abs(sum) < minValue) {
						minValue = Math.abs(sum);
					}
				}
			}
		}
		return minValue;
	}
}
		

