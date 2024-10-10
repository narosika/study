package JhStude.EX;

import java.util.Scanner;

public class ch04ban {

	public static void main(String[] args) {
		int bank = 0;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run)
		{
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택:> ");
			int selectNum = Integer.parseInt(sc.nextLine());
			
			switch (selectNum) {
			case 1:
			{
				System.out.print("예금액:> ");
				int i = Integer.parseInt(sc.nextLine());
				bank += i;
				break;
			}
			case 2:
			{
				System.out.print("출금액:> ");
				int i = Integer.parseInt(sc.nextLine());
				bank -= i;
				break;
			}
			case 3:
			{
				System.out.println("현재잔액:" + bank);
				break;
			}
			case 4:
			{
				run = false;
			}	
			}
		}
		System.out.println("프로그램 종료");
	}

}
