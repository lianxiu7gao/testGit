package cn.bdqn;

public abstract class Pet {

	public Pet(){}
	
	public Pet(String name){
		this.name = name;
	}
	
	private String name;
	private int health;
	private int love;
	
	public abstract void print();
	
	public void call(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
	
}
