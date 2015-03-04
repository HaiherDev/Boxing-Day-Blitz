package haiherdev.boxingdayblitz.xmlReader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Created by David on 3/1/2015.
 */
public class Reader {

    public Reader () {}

    private Object jaxbXMLToObject(File f, Class<?> c) {
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller un = context.createUnmarshaller();
            Object object = un.unmarshal(f);
            return object;
        } catch (JAXBException e) {
            e.printStackTrace();
            System.err.println("Yo dawg. I heard you like your error,"
                    + "\nso I put some error in your error."
                    + "\n\nnyerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }
        return null;
    }
}
