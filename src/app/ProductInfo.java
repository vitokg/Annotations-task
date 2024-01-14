package app;

@Product(name = "orange", quota = 12)
public class ProductInfo {

    @Product(name = "tomato", quota = 50)
    public String getData() {
        return "No data...";
    }
}
