package test;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class CarsList {
    @XmlElement(name = "car")
    private List<Car> list;

    public void setList(List<Car> list) {
        this.list = list;
    }
    public List<Car> getCar(){
        return list ;
    }
}
