package cn.bdqn;

public class Penguin extends Pet{

	public static final String HOME = "�ϼ�";
	
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
		System.out.println("������԰�");
		System.out.println("�ҵ����ֽ�"+this.getName()+",�ҵĽ���ֵ��"+this.getHealth()+",�Һ����˵����ܶ���"+this.getLove());
		System.out.println("���Ա���"+sex);
	}
	
}
