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

//����xml�ļ�
public class XmlDemo {

	private File f = new File("file/contacts.xml");
	
	public void testGetDocument() throws Exception{
		//1����ʾ��Ҫ��������xml�ļ�·��
		File f = new File("file/contacts.xml");
		//2������DocumentBuilderFactory�࣬��ȡDocumentBuilderFactory����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//3������DocumentBuilderFactory���󣬹���DocumentBuilder����
		DocumentBuilder builder = factory.newDocumentBuilder();
		//4������DocumentBuilder���󣬹���Document����
		Document doc = builder.parse(f);
		System.out.println(doc);
	}

	@Test
	public void test1() throws Exception {
		//1����ȡ�ĵ�����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		//2����ȡ��Ԫ��
		Element root = doc.getDocumentElement();
		//3����ȡ�ڶ���linkman
		NodeList nodeList = root.getChildNodes();
		Element linkmanEl = (Element) nodeList.item(1);
		//4����ȡlinkmanԪ���µĵ�һ��nameԪ��
		Element nameEl = (Element) linkmanEl.getElementsByTagName("name").item(0);
		String name = nameEl.getTextContent();
		System.out.println(name);
	}
	
	//�޸ĵڶ�����ϵ�˵�email
	@Test
	public void test2() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		
		Element root = doc.getDocumentElement(); //��ȡ���ڵ�
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(0);
		Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
		emailEl.setTextContent("liuxianglin@163.com");
		//�ؼ���ͬ��������Ҫ�����ظı������ͬ�������̵�xml����
		TransformerFactory factory1 = TransformerFactory.newInstance();
		Transformer trans = factory1.newTransformer();
		Source source = new DOMSource(doc); //�ڴ��е�document����
		Result target = new StreamResult(f);
		trans.transform(source, target);
	}
	
	//����µ���ϵ��
	@Test
	public void test3() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		
		Element root = doc.getDocumentElement(); //��ȡ���ڵ�
		Element linkmanEl = (Element) root.getElementsByTagName("linkman").item(0);
		Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
		emailEl.setTextContent("liuxianglin@163.com");
	
		Element linkmanEl2 = doc.createElement("linkman");
		Element nameEl = doc.createElement("name");
		Element emailEl2 = doc.createElement("email");
		Element addressEl = doc.createElement("address");
		Element groupEl = doc.createElement("group");
		
		nameEl.setTextContent("�Ƿ�");
		emailEl2.setTextContent("qiaofeng@360.com");
		addressEl.setTextContent("�ɹ�");
		groupEl.setTextContent("��������");
	
		linkmanEl2.appendChild(nameEl);
		linkmanEl2.appendChild(emailEl2);
		linkmanEl2.appendChild(addressEl);
		linkmanEl2.appendChild(groupEl);
	
		root.appendChild(linkmanEl2);
		
		//�ؼ���ͬ��������Ҫ�����ظı������ͬ�������̵�xml����
		TransformerFactory factory1 = TransformerFactory.newInstance();
		Transformer trans = factory1.newTransformer();
		Source source = new DOMSource(doc); //�ڴ��е�document����
		Result target = new StreamResult(f);
		trans.transform(source, target);
	}
}
