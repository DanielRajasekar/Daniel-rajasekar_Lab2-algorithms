package com.transaction.main;
import java.util.Scanner;

import com.transaction.service.TransactionService;
public class TransactionDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the values of array");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();}
		
		System.out.println("Enter the total no of target that needs to be achieved");
		int targetNo= sc.nextInt();
		
		TransactionService transactionService = new TransactionService();
		transactionService.checkTransaction(arr,targetNo);
		sc.close();
	}
}
