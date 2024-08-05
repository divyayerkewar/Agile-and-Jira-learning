public class Epic {
    String epicname; // epic name
    String epicdescription; // epic description

    // constructor for epicname and description
    public Epic(String epicname, String epicdescription) {
        this.epicname = epicname; // this. epicname define class field
        this.epicdescription = epicdescription; // this.epicdescription define class field
    }

    public static void main(String[] args) {
        Epic epic = new Epic("User registration", "Manage user registration.");

        System.out.println("epic name ->" + "  " + epic.epicname); // print epic name
        System.out.println("epic description ->" + "  " + epic.epicdescription); // print epic descriptions

    }

}
