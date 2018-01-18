package study.emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java j = new java("java", "123456");
//		j.work();
		JavaEmp jEmp= new java("javaEmp","0001");
		NetEmp nEmp= new Net("NetEmp","0001");
//		jEmp.work();
		
		Emp emp = new java("java3", "01");
		
//		emp.work();
		new Manager().Watchwho(nEmp);
		
		
	}

}
