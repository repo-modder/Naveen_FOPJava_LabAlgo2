package com.gl.service;

public class TransactionServiceImpl implements TransactionService{
	public void checkTransactionTarget(long [] transactions, long target) {
		long totalCount = 0;
		for(long i = 0; i < transactions.length; ++i) {
			totalCount +=  transactions[(int) i];
			if(totalCount >= target) {
				System.out.printf("Target achieved after %d transactions\n\n", (i+1));
				return;
			}
		}
		System.out.println("Given target is not achieved\n");
	}
}
