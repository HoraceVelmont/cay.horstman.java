package ch8;

import java.util.List;

public class FindContactPeople {
	public static void main(String[] args) {
		List<Contact> contactList = ContactSource.findAll();

		int manCount = 0;
		int totalAge = 0;
		for (Contact contact : contactList) {
			if ("Florida".equals(contact.getState())) {
				manCount++;
				totalAge += contact.getAge();
			}
		}

		double averageAge = totalAge / manCount;
	}

	public static void usingStreamAndLambda() {
		List<Contact> contacts = ContactSource.findAll();

		contacts.stream().filter(c -> "Florida".equals(c.getState())).mapToInt(c -> c.getAge()).average();
	}
}

class Contact {
	public String getState() {
		return "";
	}

	public int getAge() {
		return 0;
	}
}

class ContactSource {
	public static List<Contact> findAll() {
		return null;
	}
}
