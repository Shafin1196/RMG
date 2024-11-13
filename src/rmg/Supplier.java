
package rmg;
import java.util.*;
public class Supplier {
    String id,name,contactInfo;
    List<Fabric>suppliedFabrics=new ArrayList<>();
    
    void addFabric(Fabric fabric){
        suppliedFabrics.add(fabric);
    }
    List<Fabric>getSuppliedFabrics(){
        return suppliedFabrics;
    }
    
    
}
