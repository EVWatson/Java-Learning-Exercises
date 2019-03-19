package More_oops;

public class ShoppingCentre extends BuildingRequirements {

    private final String retailer;

    ShoppingCentre(String retailer) {
        super();
        this.retailer = retailer;
    }

    @Override
    int numberOfStoreys() {
        return 3;
    }

    @Override
    int buildingCapacity() {
        return 1500;
    }

    @Override
    String buildingPurpose() {
        return "convenient shopping location";
    }

    @Override
    String buildingMaterials() {
        return "concrete, tiles, wood, steel, glass, shop fittings and fixtures";
    }

    @Override
    String buildingApproval() {
        return "yes";
    }
}
