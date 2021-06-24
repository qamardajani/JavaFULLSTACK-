public class Wizard  extends Human{
	public Wizard()
	{
		this.intelligence=8;
		this.health=50;
	}
	 public Wizard (String name)
	 {
		 this.intelligence=8;
			this.health=50;
			this.name=name;
	 }
	 public void heal (Human human) {
		 human.setHealth(human.getHealth()+intelligence);
		 System.out.println("ooh");
		 System.out.println(human.getName()+this.intelligence);
		 
	 }
	}


