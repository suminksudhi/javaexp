package com.example.generics;

public class AcountManager {

	public static void main(String[] args) {
		
		SavingAccount savingAccount = new SavingAccount("Laden",12.00,50000.00);
		CurrentAccount currentAccount = new CurrentAccount("Laden",12.00,500000.00);
		
		AccountServiceImpl<SavingAccount,String> impl1 = new AccountServiceImpl<>();
		System.out.println(impl1.openAccount(savingAccount));
		System.out.println(impl1.closeAccount(savingAccount));
		impl1.bankDetails("Sanghai Bank");
		
		AccountServiceImpl<CurrentAccount,String> impl2 = new AccountServiceImpl<>();
		System.out.println(impl2.openAccount(currentAccount));
		System.out.println(impl2.closeAccount(currentAccount));
		impl2.bankDetails("SBI Bank");
		
		
		/*Account account = new Account("Laden",12.00);
		AccountServiceImpl_bak accountServiceImpl = new AccountServiceImpl_bak();
		System.out.println(accountServiceImpl.openAccount(account));
		System.out.println(accountServiceImpl.closeAccount(account));
		*/
	}
}