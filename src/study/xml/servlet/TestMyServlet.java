package study.xml.servlet;

import java.io.File;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestMyServlet {
	

	@Test
	public void testMyServlet() {
		MyServlet servlet = new MyServlet();
		servlet.init();
		servlet.service();
		servlet.destory();
	}
	@Test
	public void testMyServlet1() throws Exception {
		Element servletClassName = null;
		Element servletClass = null;
		Scanner scanner=new Scanner(System.in);
		String sc=scanner.nextLine();
		
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File("src/study/xml/servlet/Web.xml"));
		Element rootElement = document.getRootElement();
		List<Element> servletMappingElements = rootElement.elements("servlet-mapping");
		List<Element> servletClassElements = rootElement.elements("servlet");
		for(Element servletMappingElement:servletMappingElements) {
			if(servletMappingElement.element("url-pattern").getText().equals(sc)) {
				servletClassName = servletMappingElement.element("servlet-name");
			}
		}
		for(Element servletClassElement:servletClassElements) {
			if(servletClassElement.element("servlet-name").getText().equals(servletClassName.getText())) {
				servletClass = servletClassElement.element("servlet-class");
			}
		}
		System.out.println(servletClass.getText());

		 String string = servletClass.getText();
		 Class classz = Class.forName(string);
		 IMyServlet iServlet = (IMyServlet)classz.newInstance();
		 iServlet.init();
		 iServlet.service();
		 iServlet.destory();
		// Method method = classz.getMethod("init");
		// method.invoke(iServlet);
	}
}
