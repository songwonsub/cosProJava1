package cosProJava1;

public class TimeMachine {
	 public long solution(long num) {
	        num = num + 1;
					String sNum = String.valueOf(num); 
					String result = sNum.replace("0", "1");
					
					Long rNum = Long.valueOf(result);
				
				return rNum;
	    }
	 public static void main(String[] args) {
		 TimeMachine sol = new TimeMachine();
	        long num = 9949999;
	        long ret = sol.solution(num);

	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
}
