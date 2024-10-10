package JhStude.EX.sec06;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);
	private String bankNum;
	private String accountMaster;
	private int bank;
	private String sum;
	String[] bankAccount = new String[100];
	int x = 0;
	


	public void setSum(String...values) {
		System.out.println("계좌번호: ");
		String bankNum = sc.nextLine();
		System.out.println("계좌주: ");
		String accountMaster = sc.nextLine();
		System.out.println("초기 입금액: ");
		int bank = sc.nextInt();

		this.bankNum = bankNum;
		this.accountMaster = accountMaster;
		this.bank = bank;

		/*
		System.out.println(bankNum);
		System.out.println(accountMaster);
		System.out.println(bank);
		*/
		String sum = bankNum + "\t" + accountMaster + "\t"+bank;
		this.sum = sum;

	}

	public String getSum(){
		return sum;
	}


	public void print()
	{
		
		for(int i =0 ; i<bankAccount.length ; i++)
		{
			if(bankAccount[i] != null)
			{
				System.out.println(bankAccount[i]);
			}
		}
			
		
	}
	






}
