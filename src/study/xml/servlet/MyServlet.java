package study.xml.servlet;

public class MyServlet implements IMyServlet {

	@Override
	public void init() {
		System.out.println("MyServlet--init....");
	}

	@Override
	public void service() {
		System.out.println("MyServlet--Service....");
	}

	@Override
	public void destory() {
		System.out.println("MyServlet--Destory....");
	}

}
