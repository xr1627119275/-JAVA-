package study.callback;

public class UserMangner implements Callback{

	@Override
	public void success() {
		// TODO Auto-generated method stub
		System.out.println("登陸成功");
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
		System.out.println("登录失败");
	}

}
