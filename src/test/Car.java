package test;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Car {

    private String mark;
    private String model;
    private int power;
    private int maxSpeed;
    private double price;
    private String number;

    @XmlAttribute
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
