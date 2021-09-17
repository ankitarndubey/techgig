package in.ankita.techgig;

import java.io.*;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] strings = new String[size];
		int i = 0;
		while (i < size) {
			strings[i] = sc.next();
			i++;
		}
		for (int p = 0; p < size; p++) {
			System.out.println(strings[p].length());
		}

		for (int j = 0; j < size; j++) {
			System.out.println("j "+j);

			int odd_sum = 0;
			int even_sum = 0;
			System.out.println(strings[j].length());
			for (int k = 0; k < strings[j].length(); k++) {
				System.out.println(strings[j].charAt(k));
				if (k % 2 == 0) {
					even_sum += strings[j].charAt(k);
				} else {
					odd_sum += strings[j].charAt(k);
				}

			}

			int abs_diff = Math.abs(odd_sum - even_sum);
			if (abs_diff % 3 == 0 || abs_diff % 5 == 0 || abs_diff % 7 == 0)
				System.out.println("Prime String");
			else
				System.out.println("Casual String");

		}
	}
}
