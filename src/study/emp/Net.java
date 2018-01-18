package study.emp;

public class Net extends NetEmp{
	public Net(String name,String id){
		super(name, id);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("我是" + super.getName() + ",我的员工ID是" + super.getId());
	}

}
