
package rmg;


public class Fabric {
    String id,type,color;
    double pricePerMeter;
    
    double calculateCost(double meters){
        return pricePerMeter*meters;
    }
}
