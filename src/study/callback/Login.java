package study.callback;

public class Login {
	public void login(String name,String passwd,Callback callback) {
		if(name == "1"&&passwd=="1") {
			callback.success();
		}else {
			callback.error();
		}
	}
}
interface Callback {
	void success();
	void error();
}