package lesson1211.dz;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            //   JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
            //   Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            Book book1 = new Book();
            book1.setArtikul("hr-158");
            book1.setName("history1");
            book1.setYear(2002);


            Book book2 = new Book();
            book2.setArtikul("hr-162");
            book2.setName("history2");
            book2.setYear(2005);

            Book book3 = new Book();
            book3.setArtikul("hr-167");
            book3.setName("history3");
            book3.setYear(2007);

            Book book4 = new Book();
            book4.setArtikul("mt-257");
            book4.setName("math");
            book4.setYear(1998);

            Book book5 = new Book();
            book5.setArtikul("jv-158");
            book5.setName("java");
            book5.setYear(2012);


            Books librery = new Books();
            ArrayList<Book> list = new ArrayList<>();
            librery.setArrayList(list);
            librery.add(book1);
            librery.add(book2);
            librery.add(book3);
            librery.add(book4);
            librery.add(book5);
//        StringWriter sw = new StringWriter();
            JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//        jaxbMarshaller.marshal(book1, sw);
//        String xmlString = sw.toString();

            File file = new File("src/my.xml");
// output pretty printed
            //   jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(librery, file);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
}
