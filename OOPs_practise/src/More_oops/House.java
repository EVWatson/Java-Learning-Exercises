package More_oops;

public class House extends BuildingRequirements{

private final String family;


public House(String family) {
    super();
    this.family = family;
}

    @Override
    int numberOfStoreys() {
        return 1;
    }

    @Override
    int buildingCapacity() {
        return 8;
    }

    @Override
    String buildingPurpose() {
        return "a home for a family";
    }

    @Override
    String buildingApproval() {
        return "yes";
    }

    @Override
    String buildingMaterials() {
        return "wood, bricks, tiles, plaster, carpet, glass";
    }
}
