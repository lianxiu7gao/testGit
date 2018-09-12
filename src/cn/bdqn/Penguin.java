package cn.bdqn;

public class Penguin extends Pet{

	public static final String HOME = "南极";
	
	public Penguin(){}
	public Penguin(String name,String sex){
		super(name);
		this.sex = sex;
		
	}
	
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void print(){
		System.out.println("宠物的自白");
		System.out.println("我的名字叫"+this.getName()+",我的健康值是"+this.getHealth()+",我和主人的亲密度是"+this.getLove());
		System.out.println("的性别是"+sex);
	}
	
}
