package ch8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		List<String> cities = new ArrayList<>();
		for (Contact contact : contacts) {
			String city = contact.getCity();
			cities.add(contact.getCity());
		}

		cities = contacts.stream().map(contact -> contact.getCity())
				.collect(() -> new ArrayList<>(), (list, city) -> list.add(city), (left, right) -> left.addAll(right));

		cities = contacts.stream().map(contact -> contact.getCity())
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

		cities = contacts.stream().map(contact -> contact.getCity()).distinct().collect(Collectors.toList());

		Map<String, List<Contact>> contactsByState = new HashMap<>();
		for (Contact contact : contacts) {
			if (!contactsByState.containsKey(contact.getState())) {
				contactsByState.put(contact.getState(), new ArrayList<>());
			}

			contactsByState.get(contact.getState()).add(contact);
		}

		contactsByState = contacts.stream().collect(Collectors.groupingBy(Contact::getState));
	}

	static class Contact {
		String city;
		String state;

		public String getCity() {
			return "";
		}

		public String getState() {
			return state;
		}
	}
}
