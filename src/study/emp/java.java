package study.emp;

public class java extends JavaEmp {
	public java(String name, String id) {
		// TODO Auto-generated constructor stub
		super(name, id);
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("我在偷玩");
	}

	@Override
	public void work() {
		System.out.println("我是" + super.getName() + ",我的员工ID是" + super.getId());
	}

}
