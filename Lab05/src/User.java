import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // current date
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Method to display user's name and birthday
    public void displayInfo() {
        System.out.println("Name: " + name + "\n" + " Birthday: " + dob);
    }

    public static void main(String[] args) {
        // Create an instance of User named john
        User john = new User("John", 1954, 2, 18);  // John was born on February 18, 1954
        john.displayInfo();
    }
}


class Admin extends User {
    // Constructor for Admin class
    public Admin() {
        super();  // Call the default constructor of User class
    }

    public Admin(String name, int year, int month, int day) {
        super(name,year,month,day);
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName() + "\n" + " Birthday: " + getDob());
        System.out.println(" User type: admin");
    }

    // Overloaded displayInfo method with a boolean argument
    public void displayInfo(boolean full) {
        if (full) {
            System.out.println("\n" + "Name: " + getName() + "\n" + " Birthday: " + getDob());
            System.out.println(" User type: admin");
            System.out.println(" Today's date: " + LocalDate.now());
        } else {
            System.out.println("\n" + "Name: " + getName());
        }
    }

    public static void main(String[] args) {
        // Create User named john
        User john = new User("John", 1954, 2, 18);  // John was born on February 18, 1954
        john.displayInfo();

        // Create Admin named nicolas
        Admin nicolas = new Admin();
        nicolas.setName("Nicolas");
        nicolas.setDob(LocalDate.of(1964, 1, 7));  // Nicolas was born on January 7, 1964
        nicolas.displayInfo();

        // Test the overridden and overloaded displayInfo methods
        nicolas.displayInfo(true);  // Output: Full info (name, birthday, user type, today's date)
        //nicolas.displayInfo(false);  // Output: Only name
    }
}

