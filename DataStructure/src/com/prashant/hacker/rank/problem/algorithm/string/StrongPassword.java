package com.prashant.hacker.rank.problem.algorithm.string;

public class StrongPassword {
	public static void main(String[] args) {

	}

	// Still needs to work
	public int strongPassword(String password) {
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		int len = 0;
		if (password.length() < 6) {
			len = 6 - password.length();
			return len;
		}
		if (!password.contains(special_characters))
			len++;
		if (!password.contains(numbers))
			len++;
		if (!password.contains(lower_case))
			len++;
		if (!password.contains(upper_case))
			len++;

		return len;
	}
}
