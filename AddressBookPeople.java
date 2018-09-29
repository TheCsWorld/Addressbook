package people;

import java.util.ArrayList;

public class AddressBookPeople implements AddressBook{

	ArrayList <Person> listOfPeople;
	
	public AddressBookPeople()
	{
		listOfPeople = new ArrayList <Person>();
	}
	
	
	

	@Override
	public void add(Person person) {
		listOfPeople.add(person);
		
	}

	@Override
	public boolean delete(Person person) {
		// TODO Auto-generated method stub
		for(int i=0; i<this.listOfPeople.size(); i++) {
			if(person.equals(this.listOfPeople.get(i)))
			{
				listOfPeople.remove(i);
				return true;
			}
		}
//		for (Person p: this.listOfPeople) {
//			if (person.equals(p)) {
//				listOfPeople.remove(p);
//				return true;
//			}
//		}
		return false;
	}



	@Override
	public Person search(Person personToFind) {
		// TODO Auto-generated method stub
		for(Person currentPerson : this.listOfPeople)
		{
			if(personToFind.equals(currentPerson))
			{
				return currentPerson;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
