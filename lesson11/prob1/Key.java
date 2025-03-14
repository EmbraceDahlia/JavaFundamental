package lesson11.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Key key = (Key) obj;
		return firstName.equals(key.getFirstName()) && lastName.equals(key.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}
