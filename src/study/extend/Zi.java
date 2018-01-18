package study.extend;

public class Zi extends Fu {

	public void say() {
		super.say();
		System.out.println("子类say");
	}

	@Override
	void eat() {
		System.out.println("吃");
	}
}
