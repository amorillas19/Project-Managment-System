import java.util.ArrayList;

public class TeamMember {
    
    private int id;
    private String name;
    private String email;
    private ArrayList<Task> assignedTasks;

    public TeamMember(){

    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Task> getAssignedTasks() {
        return assignedTasks;
    }
    
}
