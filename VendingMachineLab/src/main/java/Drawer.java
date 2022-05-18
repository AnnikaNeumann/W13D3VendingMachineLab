import java.util.ArrayList;

public class Drawer {

    enum Code {
        A1,
        B1,
        C1;
    }

    private Code code;
    private double price;
    private ArrayList<Product> products;

    public Drawer(Code code, double price) {
        this.code = code;
        this.price = price;
        this.products = new ArrayList<Product>();


    }

    public Code getCode() {
        return code;
    }


    public double getPrice() {
        return price;
    }

    public int productCount(){
        return this.products.size();
    }

    public void addToDrawer(Product product){
        this.products.add(product);
    }

    public Product removeFromDrawer(Product product){
        this.products.remove(product);
        return product;
    }
}
