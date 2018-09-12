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
		System.out.println("������԰�");
		System.out.println("�ҵ����ֽ�"+this.getName()+",�ҵĽ���ֵ��"+this.getHealth()+",�Һ����˵����ܶ���"+this.getLove());
		System.out.println("����һֻ"+strain);
		
	}
	
	public void call(){
		
	}
	
}
