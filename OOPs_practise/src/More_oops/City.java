package More_oops;

import java.util.Arrays;
import java.util.List;

public class City {

    public static void main(String[] args){

        List<BuildingRequirements> cityscape = Arrays.asList(
                new House("the Jetsons"),
                new ApartmentBlock("Melbourne university students"),
                new Skyscraper("MYOB head office"),
                new ShoppingCentre("many new retailers to lease shop spaces")
        );

        for(BuildingRequirements c : cityscape) {
            System.out.println("Purpose: " + c.buildingPurpose() + "; Storeys: " + c.numberOfStoreys());
        }

    }


}
