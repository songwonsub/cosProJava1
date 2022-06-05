package cosProJava1;

import java.util.Arrays;

class Swril {
	public int solution(int n) {
		int[][] arr = new int[n][n];
		int i = 0 , j = 0;
		int dir = 0;
		int num = 1;
		
		
		while(true) {
			arr[i][j] = num;
			if(dir == 0 && (j == n-1 || (j < n-1 && arr[i][j+1] != 0 ))) dir++;
			else if(dir == 1 && (i == n-1 || (i < n-1 && arr[i+1][j] != 0))) dir++;
			else if(dir == 2 && (j == 0 || (j > 0 && arr[i][j-1] != 0))) dir++;
			else if(dir == 3 && (i == 0 || (i > 0 && arr[i-1][j] != 0))) dir = 0;

			if(dir == 0) j++;
			else if(dir == 1) i++;
			else if(dir == 2) j--;
			else if(dir == 3) i--;
			
			if(num == (int)Math.pow(n, 2)) break;
			num++;
		}
		for(int i1 = 0; i1 < arr.length; i1++)
			System.out.println(Arrays.toString(arr[i1]));
		
		int answer = 0;
		i = 0;

		while(i <= n-1) {
			answer += arr[i][i]; i++;
		}

		return answer;
			
    }
    public static void main(String[] args) {
    	Swril sol = new Swril();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
