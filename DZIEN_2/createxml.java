package marcin.com;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws XMLStreamException, IOException {
        StringWriter stringWriter = new StringWriter();

        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);

        xmlStreamWriter.writeStartDocument();

        xmlStreamWriter.writeStartElement("cars");
        xmlStreamWriter.writeStartElement("supercars");
        xmlStreamWriter.writeAttribute("company","Ferrari");
        xmlStreamWriter.writeStartElement("carname");
        xmlStreamWriter.writeAttribute("type","formula one");

        xmlStreamWriter.writeCharacters("Ferrari 101");
        xmlStreamWriter.writeEndElement();


        xmlStreamWriter.writeStartElement("carname");
        xmlStreamWriter.writeAttribute("type","sports");

        xmlStreamWriter.writeCharacters("Ferrari 202");
        xmlStreamWriter.writeEndElement();

        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeEndDocument();
        xmlStreamWriter.flush();
        xmlStreamWriter.close();

        String xmlS = stringWriter.getBuffer().toString();
        stringWriter.close();

        System.out.println(xmlS);
    }
}
