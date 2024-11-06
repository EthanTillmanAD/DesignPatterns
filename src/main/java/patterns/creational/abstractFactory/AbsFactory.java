package patterns.creational.abstractFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbsFactory {
    /*
    abstract factory's are a concept of a factory of factories
    factory of related objects

    its best used for when you want to group factories together
    and contain a common interface
    typically built with composition
    this pattern is build to have some things we cannot change

    some of the pitfalls for abstract factory is how complex it is
    it is the most complex creational pattern
    sometimes has issues with the runtime switch
    starts as a factory but refactored into a abstract factory

    implemented with a factory
    hides the factory
    abstracts environments

    group of similar factories
    complex
    Heavy on abstraction
    framework pattern


    Examples:
    DocumentBuilder
    Frameworks

     */

    public static void main(String[] args) throws Exception {

        String xml = "<document><body><stock>TSLA</stock></body></document>";

        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(bais);

        System.out.println("Root element : " + doc.getDocumentElement().getNodeName());

        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());

    }
}
