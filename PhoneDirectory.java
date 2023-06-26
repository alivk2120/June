import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class PhoneDirectory {
    private Map<String, String> contacts;

    public PhoneDirectory() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void searchContact(String name) {
        String phoneNumber = contacts.get(name);
        if (phoneNumber != null) {
            System.out.println("Contact found: " + name + " - " + phoneNumber);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void displayContacts() {
        System.out.println("Phone Directory:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
      Scanner s=new Scanner(System.in);

        // Adding contacts
        phoneDirectory.addContact("John Doe", "1234567890");
        phoneDirectory.addContact("Jane ", "9876543210");
        phoneDirectory.addContact("Alice ", "5678901234");
        phoneDirectory.addContact("Bob Williams", "4321098765");
        phoneDirectory.addContact("Emma Davis", "8901234567");

        // Searching for a contact
      System.out.println("enter the name to search");
      String search=s.next();
        phoneDirectory.searchContact("Alice");

        // Removing a contact
        phoneDirectory.removeContact("Jane Smith");

        // Displaying all contacts
        phoneDirectory.displayContacts();
    }
}