package com.prashant;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {

		Map<Account, String> map = new HashMap<>();
		Account ac1 = new Account();
		map.put(ac1, "value1");
		Account ac2 = new Account();
		map.put(ac2, "value2");
		Account ac3 = new Account();
		map.put(ac3, "value3");

		System.out.println(map);

		ac1.setAccountHolderName("P1");
		ac2.setAccountHolderName("P2");
		ac3.setAccountHolderName("P3");

		System.out.println(map);

		String rev = reverse("ABCD");
		System.out.println("Reversed String is : " + rev);
	}

	private static String reverse(String str) {
		if (str == null || str.equals("")) {
			return str;
		}
		String rev = reverse(str.substring(1));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("rev : "+rev);
		System.out.println("str is : " + str);
		System.out.println("str.charAt(0) : " + str.charAt(0));
		System.out.println("Reverse String is : " + rev + str.charAt(0));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		return  rev + str.charAt(0);
		// System.out.println(str+ );

	}
}

class Account {
	private int accountNumer;
	private String accountHolderName;

	public int getAccountNumer() {
		return accountNumer;
	}

	public void setAccountNumer(int accountNumer) {
		this.accountNumer = accountNumer;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

}