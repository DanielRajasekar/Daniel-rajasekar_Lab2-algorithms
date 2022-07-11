package com.notecount.main;
import java.util.Scanner;

import com.notecount.service.MergeSortImplementation;
import com.notecount.service.NotesCount;
public class NoteCountDriver {

	public static void main(String[] args) {
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of curreny denomination");
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int[]notes = new int[size];
		System.out.println("enter the currency denomination value");
		for(int i=0; i<size ;i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("enter the amout you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes,amount);
		sc.close();
	}

}
