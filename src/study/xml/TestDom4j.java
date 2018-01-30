package study.xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestDom4j {
	@Test
	public void testReadWebXml() throws Exception {
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read(new File("src/study/xml/schema/Web.xml"));
		Element rootElement = doc.getRootElement();
		System.out.println(rootElement.attributeValue("version"));
		List<Element> childElements = rootElement.elements();
		for (Element element : childElements) {
			if("servlet".equals(element.getName())) {
				Element servletName = element.element("servlet-name");
				Element servletClass = element.element("servlet-class");
				System.out.println(servletName.getText());
				System.out.println(servletClass.getText());
			}
		}
	}
}
