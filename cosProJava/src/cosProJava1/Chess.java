package cosProJava1;

public class Chess {

	public int solution(String pos) {
		int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
        int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
        
        int answer = 0;
		
		int x = 0;
		
		char ch1 = pos.charAt(1);
		String str = String.valueOf(ch1);
		
//		String[] info = pos.split("");
		Integer inY = Integer.valueOf(str) - 1;
		
		
		char ch = pos.charAt(0);
//		System.out.println(y);
		String st = String.valueOf(ch);
		switch(st){
				case "A" : x = 0; break;
				case "B" : x = 1; break;
				case "C" : x = 2; break;
				case "D" : x = 3; break;
				case "E" : x = 4; break;
				case "F" : x = 5; break;
				case "G" : x = 6; break;
				case "H" : x = 7; break;
		}
				
		Integer inX = Integer.valueOf(x);
		for(int i = 0; i < dx.length; i++) {
			if((inX + dx[i] >= 0 && inX + dx[i] < 8) && (inY + dy[i] >= 0 && inY + dy[i] < 8))
				answer++;
		}
				
			
        return answer;
    }
	
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Chess sol = new Chess();
        String pos = "D4";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
