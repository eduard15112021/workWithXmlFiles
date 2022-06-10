package lesson1211.dz;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

    private String artikul;

    private String name;

    private int year;


    @Override
    public String toString() {
        return "Book{" +
                "artikul='" + artikul + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getArtikul() {
        return artikul;
    }

    public void setArtikul(String artikul) {
        this.artikul = artikul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
