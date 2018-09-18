import java.util.*;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddy;
	

	public AddressBook(){
		this.buddy = new ArrayList<>();
	}
	
	public void addBuddy(BuddyInfo buddyInfo) {
		if(buddyInfo != null) {
			buddy.add(buddyInfo);
		}
	}

	public void removeBuddy(int index) {
		if(index >=0 && index< buddy.size()) {
			buddy.remove(index);
		}
	}
public static void main(String[] args) {
		
		System.out.println("Address Book");

	}
	
}
