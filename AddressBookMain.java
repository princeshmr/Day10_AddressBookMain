package com.bridgeLabz.Day10_AddressBookMain;

import com.bridgeLabz.AddressBook;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBookMain class");
		
		AddressBook addressBook=new AddressBook();
		addressBook.addContacts();   //add contact only for one person contact
		addressBook.displayContact(); //to display contact details
	}

}
