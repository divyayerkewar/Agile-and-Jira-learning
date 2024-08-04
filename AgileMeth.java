import java.util.ArrayList;
import java.util.List;

public class AgileMeth {
    public static void main(String[] args) {

        Feature feature = new Feature( // create a feature object with description
                "As a user , I want to  view my profile information so that i can see my personal details");

        // creates a tasj object with description(edit profile and view profile info)

        Task task1 = new Task("edit profile");
        Task task2 = new Task("view profile info");

        // adds the tasks in the feature object

        feature.tasks.add(task1);
        feature.tasks.add(task2);

        // prints the feature description
        System.out.println(feature + " " + feature.tasks);

    }

    // declare the task to represent tasks
    static class Task {
        String description;

        // constructor to initialize the description of a task
        Task(String description) {
            this.description = description;

        }

        public String toString() { // return the tasks description
            return description;
        }

    }

    static class Feature {
        String description;

        List<Task> tasks = new ArrayList<>(); // empty lists of tasks

        Feature(String description) {
            this.description = description;
        }

        public String toString() {
            return description;
        }
    }
}
