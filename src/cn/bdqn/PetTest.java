package cn.bdqn;

public class PetTest {

	public static void main(String[] args) {
		Pet pet = new Penguin("�ٺ�","Q��");
		pet.setHealth(78);
		pet.setLove(34);
		String a = Penguin.HOME;
		pet.print();
		
		Pet dog = new Dog("����","��������");
		dog.setHealth(80);
		dog.setLove(67);
		dog.print();
		
	}

}
