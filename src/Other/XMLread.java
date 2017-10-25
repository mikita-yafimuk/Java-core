package Other;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLread {
    public static void main (String[] args) throws Exception {
        DOMParser parser = new DOMParser();
        parser.parse("test.xml");
        Document document = parser.getDocument();
        Element root = document.getDocumentElement();
        NodeList personNodes = root.getElementsByTagName("person");
        for (int i = 0; i < personNodes.getLength(); i++) {
            Element person = (Element)personNodes.item(i);
            NodeList personFio = person.getElementsByTagName("fio");
            if (personFio.getLength() != 1) {
                throw new Exception("There must be exactly ONE 'fio' child node in 'person' node");
            }
            System.out.print(personFio.item(0).getTextContent());
            if (personFio.item(0).getAttributes().getLength() != 1) {
                throw new Exception("There must be exactly ONE attribute ('sex') in 'fio' node");
            }
            System.out.println (" [" + personFio.item(0).
                    getAttributes().item(0).getTextContent() +"]");
            // Теперь получаем элемент "phones", его дочерние
            // элементы "phone" и т.д.
        }
    }

}
