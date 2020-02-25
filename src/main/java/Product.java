public class Product {
    private int productId;
    private String productname;
    private int productYear;
    private int quantity;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductname() {
        return productname;
    }

    public int getProductYear() {
        return productYear;
    }

    public int getQuantity() {
        return quantity;
    }


         public Product(int productId, String productName, int productYear, int quantity) {
            this.productId = productId;
            this.productname = productName;
            this.productYear = productYear;
            this.quantity = quantity;
    }
}
