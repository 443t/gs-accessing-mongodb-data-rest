package hello;

import org.springframework.data.annotation.Id;

public class Pet {

    

    @Id private Long id;

    private String type;
    private int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}