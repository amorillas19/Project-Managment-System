import java.util.ArrayList;

public class Project {
    
    private int id;
    private String name;
    private ArrayList<Task> tasks;
    private ArrayList<TeamMember> teamMembers;

    public Project(){
        
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public ArrayList<TeamMember> getTeamMembers() {
        return teamMembers;
    }

}
