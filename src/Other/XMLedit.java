package Other;

import org.apache.xerces.parsers.DOMParser;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;

public class XMLedit {
    public static void main(String[] args) throws Exception {
        DOMParser parser = new DOMParser();
        parser.parse("test.xml");
        Document document = parser.getDocument();
        Element root = document.getDocumentElement();
        NodeList personNodes = root.getElementsByTagName("person");
        Element newPerson = document.createElement("person");
        Element newFio = document.createElement("fio");
        Element newPhones = document.createElement("phones");
        Element newPhone = document.createElement("phone");
        Text newPhoneText = document.createTextNode("999-99-99");
        Text newFioText = document.createTextNode("Someone");
        newPhone.setAttribute("type", "work");
        newPhone.appendChild(newPhoneText);
        newFio.setAttribute("sex", "?");
        newFio.appendChild(newFioText);
        newPhones.appendChild(newPhone);
        newPerson.appendChild(newFio);
        newPerson.appendChild(newPhones);
        root.appendChild(newPerson);
        OutputFormat format = new OutputFormat(document);
        format.setIndenting(true);
        XMLSerializer serializer = new XMLSerializer(
                new FileOutputStream(new File("testcopy.xml")), format);
        serializer.serialize(document);
    }
}
