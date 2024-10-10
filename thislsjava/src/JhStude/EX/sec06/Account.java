package JhStude.EX.sec06;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);
	String bankNum;
	String accountMaster;
	int bank;
	int[][] bankAccount;
	
	
	//1.계좌생성 메소드
	void newAccount()
	{
		System.out.println("계좌생성");
		System.out.println("---------------------");
		System.out.print("계좌번호: ");
		String bankNum = sc.nextLine();
		System.out.print("계좌주: ");
		String accountMaster = sc.nextLine();
		System.out.print("초기입금액: ");
		int bank = sc.nextInt();
		
		this.bankNum = bankNum;
		this.accountMaster = accountMaster;
		this.bank = bank;
		
		System.out.println(bankNum);
		System.out.println(accountMaster);
		System.out.println(bank);
	}
	
	
	
	
	
	
	/*public Account(String bankNum, String accountMaster, int bank) {
		this.bankNum = bankNum;
		this.accountMaster = accountMaster;
		this.bank = bank;

		
	}*/
}
