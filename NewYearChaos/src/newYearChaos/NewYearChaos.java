package newYearChaos;

public class NewYearChaos {
	public static void main(String[] args) {
		int[] q = {1,2,3,5,4,6};
		int count = 0;
		
		for(int i = 0; i < q.length-1; i++) {
			if((q[i] + 1) != q[i+1]) {
				if(q[i] == (q[i+1]+1)) {
					count++;
				}
				if(q[i] == (q[i+1]+2)){
					count = count + 2;
				}
				else {
					System.out.println();
				}
			}
		}
	}
}
