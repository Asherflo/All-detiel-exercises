package chapterThree;

public class PetrolPurchase {
    private boolean isEmpty;
    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double purchase;
    private double price;
    private double discount;

    public PetrolPurchase() {
        this.isEmpty = isEmpty;
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setLocation(String location) {
        this.location =location;
    }

    public String getLocation() {
        return location;
    }

    public void typeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void quantity(int quantity) {
        this.quantity =quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0.00) {
            this.price = price;


        }
    }


    public double getPrice() {
        return price;
    }

    public double getPurchase() {
        purchase= (price * quantity)- discount;
        return purchase;
    }

    public void setDiscount(double discount) {
        this.discount= discount;
    }

    public double getDiscount() {
        return  discount;
    }
}
