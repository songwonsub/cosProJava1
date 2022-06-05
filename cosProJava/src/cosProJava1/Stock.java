package cosProJava1;

public class Stock {
	int solution(int[] prices){
		  
        int inf = 1000000001;
        int tmp = inf;
        int answer = -inf;
        for(int price : prices){
            if(tmp != inf)
                answer = Math.max(answer, price - tmp);
            tmp = Math.min(tmp, price);
        }
        return answer;
    }
	
	 // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
        Stock sol = new Stock();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}
