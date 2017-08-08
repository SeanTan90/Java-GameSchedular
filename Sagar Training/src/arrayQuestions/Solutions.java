package arrayQuestions;

public class Solutions {

	public int solutions(int[] B) {
		
		if(B.length >= 100000) {
			return -1;
		}
		
				
		else {
		
		int count = 0;
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(B[j] > 1000000000) {
					return 0;
				}
				if (i == j || i > j) {

				} else {
					if (B[i] == B[j]) {
						count++;
					}
				}

			}

		}
		return count;
	}

}
	
}
