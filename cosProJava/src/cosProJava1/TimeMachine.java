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

	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
	    }
}
