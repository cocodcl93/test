
package Model;


public class Products {
    
    private int productID;
    private String productName;
    private int productPrice;
    private String productDescription;
    private String catagory; 
    private int catagoryID; 
    
    public Products() {
        this.productID = 0;
        this.productName = "";
        this.productPrice = 0;
        this.productDescription = "";
        this.catagory = "";
        this.catagoryID = 0;
    }

    public Products(int productID, String productName, int productPrice, String productDescription, String catagory, int catagoryID) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.catagory = catagory;
        this.catagoryID = catagoryID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    
    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    
    public int getCatagoryID() {
        return catagoryID;
    }

    public void setCatagoryID(int catagoryID) {
        this.catagoryID = catagoryID;
    }

    @Override
    public String toString() {
        return "Products{" + "productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice + ", productDescription=" + productDescription + ", catagory=" + catagory + ", catagoryID=" + catagoryID + '}';
    }



  
}

