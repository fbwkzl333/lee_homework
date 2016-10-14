// 메인메뉴에 주석 넣기

package homework4;

import java.util.*;

public class ExamForWhile {

	public static boolean isNumber(String str) {
	        if(str==null || str.equals(""))
	            return false;
	    
	        for(int i=0; i<str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if(ch<'0' || ch>'9') {
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main(String[] args){
		String selected;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("1. 1遺��꽣 �엯�젰�븳 �닔源뚯� �뜑�븯湲�");
			System.out.println("2. 理쒕�媛�/理쒖냼媛� 援ы븯湲�");
			System.out.println("3. �엯�젰諛쏆� �닽�옄�쓽 �빀怨꾩� �룊洹� 援ы븯湲�");
			System.out.println("4. �썝�븯�뒗 援ш뎄�떒 異쒕젰�븯湲�");
			System.out.println("5. 吏앹닔�떒/���닔�떒 異쒕젰�븯湲�");
			System.out.println("6. �봽濡쒓렇�옩 醫낅즺");
			System.out.println("�썝�븯�뒗 硫붾돱�뒗 >> ");
			selected = s.nextLine();
			if(!isNumber(selected) || Integer.parseInt(selected) > 6 || Integer.parseInt(selected) < 1){
				System.out.println("�옒紐� �엯�젰�븯�뀲�뒿�땲�떎. �떎�떆 �엯�젰 諛붾엻�땲�떎.");
				continue;
			}
			if(Integer.parseInt(selected) == 1)
				new SumOfNumbers().input();
			else if(Integer.parseInt(selected) == 2)
				new MaxAndMin().input();
			
			else if(Integer.parseInt(selected) == 3)
				new SumAndAvg().input();
			
			else if(Integer.parseInt(selected) == 4)
				new GuGuDan().input();
			else if(Integer.parseInt(selected) == 5)
				new GuGuDan2().input();
			else if(Integer.parseInt(selected) == 6){
				System.out.println("�봽濡쒓렇�옩�쓣 醫낅즺�빀�땲�떎.");
				s.close();
				System.exit(0);
			}
			
		} while(true);
	}
}
