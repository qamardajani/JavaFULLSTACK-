
public class HumanTest {

	public static void main(String[] args) {
	
		Human testHuman1= new Human("hut");
		Human testHuman2= new Human("hui");
		Human testHuman3= new Human("huq");
		System.out.println(testHuman3.getHealth());
		testHuman1.attack(testHuman3);
		System.out.println(testHuman3.getHealth());

	}

}
