package JhStude.EX.sec06;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run)
		{
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택:> ");
			int selectNum = sc.nextInt();
			
			if(selectNum == 1)
			{
				System.out.println("-----------------");
				System.out.println("계좌생성");
				System.out.println("-----------------");

				a.setSum();
			}

			
			if(selectNum == 2)
			{
				System.out.println("-----------------");
				System.out.println("계좌목록");
				System.out.println("-----------------");

				a.print();
				
			}

			
			
			
		}

	}

}
