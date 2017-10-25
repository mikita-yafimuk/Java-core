package Other;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLTutorial {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("test.xml"));

        Element element = document.getDocumentElement();
        System.out.println(element.getTagName());
        printElements(element.getChildNodes(), 0, "city");
/*        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                System.out.println(((Element) nodeList.item(i)).getTagName());
            }
            if (nodeList.item(i).hasChildNodes()) {
                System.out.println(((Element) nodeList.item(i)).getNodeName());
                System.out.println(nodeList.item(i).getTextContent());
            }
        }*/

    }

    protected static void printElements(NodeList nodeList, int tabs, String attribute) {
        String popitka = "   ";
        String nepitka = "      ";

        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                System.out.println(popitka + ((Element) nodeList.item(i)).getTagName());
                if (((Element) nodeList.item(i)).hasAttribute(attribute)) {
                    System.out.println(((Element) nodeList.item(i)).getAttribute(attribute));
                }
                if (nodeList.item(i).hasChildNodes()) {
                    printElements(nodeList.item(i).getChildNodes(), ++tabs, attribute);
                }
            }
        }
    }

    private static String getTabs(int tabs) {
        String str = "";
        for (int i = 0; i < tabs; i++) {
            str +="   ";
        }
        return str;
    }
}
