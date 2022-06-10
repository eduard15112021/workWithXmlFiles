package lesson1211.dz;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Books {

    @XmlElement(name = "book")

    private List<Book> list;

//    public Books() {
//    }

    public void add(Book book) {
       list.add(book);
    }

    public void setArrayList(ArrayList<Book> arrayList) {
        this.list = arrayList;
    }

    @Override
    public String toString() {
        return "Books{" +
                "list=" + list +
                '}';
    }
}
