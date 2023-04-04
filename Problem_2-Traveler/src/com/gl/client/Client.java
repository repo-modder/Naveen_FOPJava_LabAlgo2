package com.gl.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gl.service.CurrencyService;
import com.gl.service.CurrencyServiceImpl;;

public class Client {
	public static void main(String[] args) {
		CurrencyService currencyService = new CurrencyServiceImpl();

		List<Integer> denominators = new ArrayList<>();
		int sizeOfDenominators = 0;
		int amount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		sizeOfDenominators = sc.nextInt();

		System.out.println("enter the currency denominations value");
		for (int i = 0; i < sizeOfDenominators; ++i) {
			int d = sc.nextInt();
			denominators.add(d);
		}
		
		System.out.println("enter the amount you want to pay");
		amount = sc.nextInt();
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		currencyService.denominatorService(denominators, amount);
	}

}
