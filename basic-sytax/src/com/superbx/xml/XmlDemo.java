package com.superbx.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//操作xml文件
public class XmlDemo {

	private File f = new File("file/contacts.xml");
	
	public void testGetDocument() throws Exception{
		//1、表示出要被操作的xml文件路径
		File f = new File("file/contacts.xml");
		//2、根据DocumentBuilderFactory类，获取DocumentBuilderFactory对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//3、根据DocumentBuilderFactory对象，构建DocumentBuilder对象
		DocumentBuilder builder = factory.newDocumentBuilder();
		//4、根据DocumentBuilder对象，构建Document对象
		Document doc = builder.parse(f);
		System.out.println(doc);
	}

	@Test
	public void test1() throws Exception {
		//1、获取文档对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		//2、获取根元素
		Element root = doc.getDocumentElement();
		//3、获取第二个linkman
		NodeList nodeList = root.getChildNodes();
		Element linkmanEl = (Element) nodeList.item(1);
		//4、获取linkman元素下的第一个name元素
		Element nameEl = (Element) linkmanEl.getElementsByTagName("name").item(0);
		String name = nameEl.getTextContent();
		System.out.println(name);
	}
	
	//修改第二个联系人的email
	@Test
	public void test2() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		
		Element root = doc.getDocumentElement(); //获取根节点
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(0);
		Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
		emailEl.setTextContent("liuxianglin@163.com");
		//关键：同步操作，要将本地改变的数据同步到磁盘的xml文中
		TransformerFactory factory1 = TransformerFactory.newInstance();
		Transformer trans = factory1.newTransformer();
		Source source = new DOMSource(doc); //内存中的document对象
		Result target = new StreamResult(f);
		trans.transform(source, target);
	}
	
	//添加新的联系人
	@Test
	public void test3() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		
		Element root = doc.getDocumentElement(); //获取根节点
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(0);
		Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
		emailEl.setTextContent("liuxianglin@163.com");
	
		Element linkmanEl2 = doc.createElement("linkman");
		Element nameEl = doc.createElement("name");
		Element emailEl2 = doc.createElement("email");
		Element addressEl = doc.createElement("address");
		Element groupEl = doc.createElement("group");
		
		nameEl.setTextContent("乔峰");
		emailEl2.setTextContent("qiaofeng@360.com");
		addressEl.setTextContent("辽国");
		groupEl.setTextContent("江湖高手");
	
		linkmanEl2.appendChild(nameEl);
		linkmanEl2.appendChild(emailEl2);
		linkmanEl2.appendChild(addressEl);
		linkmanEl2.appendChild(groupEl);
	
		root.appendChild(linkmanEl2);
		
		//关键：同步操作，要将本地改变的数据同步到磁盘的xml文中
		TransformerFactory factory1 = TransformerFactory.newInstance();
		Transformer trans = factory1.newTransformer();
		Source source = new DOMSource(doc); //内存中的document对象
		Result target = new StreamResult(f);
		trans.transform(source, target);
	}
}
