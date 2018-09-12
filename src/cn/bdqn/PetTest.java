package cn.bdqn;

public class PetTest {

	public static void main(String[] args) {
		Pet pet = new Penguin("嘿嘿","Q仔");
		pet.setHealth(78);
		pet.setLove(34);
		String a = Penguin.HOME;
		pet.print();
		
		Pet dog = new Dog("聊聊","拉布拉多");
		dog.setHealth(80);
		dog.setLove(67);
		dog.print();
		
	}

}
