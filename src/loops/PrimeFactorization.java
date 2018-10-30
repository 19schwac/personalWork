package loops;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int remainder = 0;
		int primeTest = 0;
		System.out.println("What number should we find the prime factors for?");
		int num = input.nextInt();
		for (int count = 1; count <= num; count++) {
			for (int prime = 2; prime <= num; prime++) {
				remainder = count % prime;
				if (remainder == 0) {
					primeTest++;
				}
			}
		}
	
	
