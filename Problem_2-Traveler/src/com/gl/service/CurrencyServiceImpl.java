package com.gl.service;

import java.util.Collections;

import java.util.List;

public class CurrencyServiceImpl implements CurrencyService {
	@Override
	public void denominatorService(List<Integer> denominators, double amount) {

		Collections.sort(denominators, Collections.reverseOrder());

		for (Integer denominator : denominators) {
			int currentNoOfDenominators = 0;
			while (denominator <= amount) {
				amount -= denominator;
				currentNoOfDenominators++;
			}
			if (currentNoOfDenominators != 0) {
				System.out.println(denominator + ":" + currentNoOfDenominators);
			}
		}
	}

}
