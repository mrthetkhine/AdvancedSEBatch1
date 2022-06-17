package com.turing.oop.designpattern.abstractfactory;
abstract class ReportHeader
{
	abstract void generateHeader();
}
abstract class ReportBody
{
	abstract void generateBody();
}
class HtmlHeader extends ReportHeader
{

	@Override
	void generateHeader() {
		System.out.println("Header in HTML");
	}
	
}
class HtmlBody extends ReportBody
{
	@Override
	void generateBody() {
		System.out.println("Body in HTML");
	}
	
}
class XmlHeader extends ReportHeader
{

	@Override
	void generateHeader() {
		System.out.println("Header in XML");
	}
	
}
class XmlBody extends ReportBody
{
	@Override
	void generateBody() {
		System.out.println("Body in XML");
	}
	
}
abstract class ReportFactory {
	abstract ReportHeader createHeader();
	abstract ReportBody createBody(); 
}
class HTMLReportFactory extends ReportFactory {
	@Override
	ReportHeader createHeader() {
		return new HtmlHeader(); 
	}
	@Override
	ReportBody createBody() {
		return new HtmlBody(); 
	}
}
class XmlReportFactory extends ReportFactory {
	@Override
	ReportHeader createHeader() {
		return new XmlHeader(); 
	}
	@Override
	ReportBody createBody() {
		return new XmlBody(); 
	}
}
public class AbstractFactoryDemo {
	
	public static void main(String[]args)
	{
		ReportFactory factory = new HTMLReportFactory();
		
		ReportHeader header = factory.createHeader();
		ReportBody body = factory.createBody();
		
		header.generateHeader();
		body.generateBody();
	}
	
}
