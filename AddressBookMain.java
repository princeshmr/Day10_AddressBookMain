package com.bridgeLabz.Day10_AddressBookMain;

import java.util.Scanner;

import com.bridgeLabz.AddressBook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBookMain class");
		
		AddressBook addressBook=new AddressBook();
		//addressBook.addContacts();   //add contact only for one person contact
		//addressBook.displayContact(); //to display contact details
		
		//System.out.println("To edit the personal details");
		//addressBook.editContact();  //if we want change contact details   
		//addressBook.displayContact();  //To display contact after edit contact details
		
		//System.out.println("To Delete the personal details");
		//addressBook.deleteContact();   //if we want to delete personal details
		//addressBook.displayContact();
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the number of contact you want to add: ");
		 int numberOfContacts=scan.nextInt();
	   	 for(int i=0; i<numberOfContacts; i++) {
				addressBook.addContacts();      //add contact more than 1 person contact
		 }
	   	 addressBook.displayContact();
	}

}
