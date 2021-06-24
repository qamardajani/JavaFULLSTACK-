import java.util.*;
public class ProjectClass {
	String name;
	String desc;

	public ProjectClass (){

	}
	public ProjectClass (String name){

	}
    public ProjectClass (String name, String desc){

    }
    public String ElevatorPitch() {
        return String.format("%s %s", name,desc);
    }
    public String getName() { 
    	return name;
     }
    public String getDescription() { 
    	return desc; 
    }
     public void setName(String name) { 
     	this.name = name;
      }
    public void setDescription(String desc) { 
    	this.desc = desc; 
    }
}