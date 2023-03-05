import java.util.List;
import java.util.ArrayList;

public class TestTrack{

    public static void race(RemoteControlCar car) {
        car.drive();
    }
    
    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> res = new ArrayList<>();

        if(prc1.compareTo(prc2) >= 0){
        res.add(prc2);
        res.add(prc1);   
        }else{
        res.add(prc1);
        res.add(prc2);
        }
        
        return res;
    }
}
