package More_oops;

public class Skyscraper extends BuildingRequirements {

    private final String office;

    Skyscraper(String office) {
        super();
        this.office = office;
    }

    @Override
    int numberOfStoreys() {
        return 55;
    }

    @Override
    int buildingCapacity() {
        return 2000;
    }

    @Override
    String buildingPurpose() {
        return "corporate offices for rent";
    }

    @Override
    String buildingMaterials() {
        return "concrete, steel, cladding, wood, glass";
    }

    @Override
    String buildingApproval() {
        return "under consideration";
    }
}
