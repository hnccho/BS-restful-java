package org.coffeeshop;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A plain Coffee resource
 * @author  Bhakti Mehta
 */
@XmlRootElement
//@XmlType(propOrder={ "type",  "size","name", "price", "order"})
public class Coffee {

    private String type;
    private String size;

    @NotNull
    private String name;
    private double price;

    private int order;

    public Coffee(String type, String size,String name, double price) {
        this.type = type;
        this.size = size;
        this.name = name;
        this.price = price;
        this.order = getOrder();
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return CoffeeService.getCounter();
    }

    public Coffee(){
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name)
                .append(" Size: ").append(size)
                .append(" Price: ").append(price)
                .append(" Type: ").append(type);
        return sb.toString();
    }
    
}
