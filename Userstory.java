
public class Userstory {
    String name; // task name
    String details; // task deatils

    public Userstory(String name, String details) { // constructor

        this.name = name;
        this.details = details;
    }

    // show task details
    public void printinfo() {
        System.out.println("Task :" + name);
        System.out.println("Details:" + details);

    }

    public static void main(String[] args) {
        // create user instance
        Userstory userstory = new Userstory("User registration", "Create a user with valid details");
        userstory.printinfo();
    }

}
