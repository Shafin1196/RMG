
package rmg;


public class Garment {
    String id,name,description,color,size;
    double price;
    int stockQuantity;
    void UpdateStock(int quantity)
    {
        stockQuantity+=quantity;
    }
    double calculateDiscountPrice(double discountPercentage){
        return price-(price*discountPercentage)/100;
    }
}

