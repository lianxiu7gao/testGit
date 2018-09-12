package cn.bdqn;

public class Dog extends Pet{

	public Dog(){}
	
	public Dog(String name,String strain){
		super(name);
		this.strain = strain;
	}
	
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public void print() {
		System.out.println("宠物的自白");
		System.out.println("我的名字叫"+this.getName()+",我的健康值是"+this.getHealth()+",我和主人的亲密度是"+this.getLove());
		System.out.println("我是一只"+strain);
		
	}
	
	public void call(){
		
	}
	
}
