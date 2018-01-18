package study.callback;

public class Test{
	public static void main(String[] args) {
		Login login = new Login();
		UserMangner userMangner = new UserMangner();
		login.login("2", "1", new Callback() {
			
			@Override
			public void success() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void error() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	
}
