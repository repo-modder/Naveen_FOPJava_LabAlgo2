package com.gl.client;

import java.util.Scanner;

import com.gl.service.TransactionService;
import com.gl.service.TransactionServiceImpl;;

public class Client {
	public static void main(String[] args) {
		TransactionService transactionService = new TransactionServiceImpl();

		long[] transactions = null;
		long sizeOfTransactions = 0;
		long target = 0;
		long numberOfTarget = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of transaction array");
		sizeOfTransactions = sc.nextLong();

		transactions = new long[(int) sizeOfTransactions];
		System.out.println("enter the values of array");
		for (long i = 0; i < sizeOfTransactions; ++i) {
			transactions[(int) i] = sc.nextLong();
		}

		System.out.println("enter the total no of targets that needs to be achieved");
		numberOfTarget = sc.nextLong();

		for (long i = 0; i < numberOfTarget; ++i) {
			System.out.println("enter the value of target");
			target = sc.nextLong();
			transactionService.checkTransactionTarget(transactions, target);
		}

	}
}
