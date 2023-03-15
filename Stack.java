package my.project;

import java.util.ArrayList;

public class Stack {
    
    private ArrayList<Integer> stdIDs;
    private MmustLinkedIn linkedIn;
    
    public Stack(String username, String password){
        this.stdIDs = new ArrayList<>();
        this.linkedIn = new MmustLinkedIn(username,password);
    }
    
    public void push(int stdID){
        this.stdIDs.add(stdID);
        this.linkedIn.postUpdate("Added studentId " + stdID + " to the school portal.");
    }
    
    public int pop(){
        if(this.stdIDs.isEmpty()){
            this.linkedIn.postUpdate("Tried to pop from an empty stack");
            return - 1; //return -1 to indicate an error
        }
        int stdID = this.stdIDs.get(this.stdIDs.size()-1);
        this.stdIDs.remove(this.stdIDs.size()- 1);
        this.linkedIn.postUpdate("Removed stdID " + stdID + " from the portal");
        return stdID;
    }
    
    public static void main(String[] args){
        
        Stack stack = new Stack("Student@Mmust", "MMUST2023");
        
        stack.push(001);
        stack.push(002);
        stack.push(003);
        stack.push(004);
        System.out.println(stack.stdIDs);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}