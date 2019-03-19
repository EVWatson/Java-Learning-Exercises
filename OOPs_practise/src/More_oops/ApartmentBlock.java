package More_oops;

public class ApartmentBlock extends BuildingRequirements {

    private final String student;

    ApartmentBlock(String student) {
        super();
        this.student = student;
    }

    @Override
    int numberOfStoreys() {
        return 40;
    }

    @Override
    int buildingCapacity() {
        return 1000;
    }

    @Override
    String buildingPurpose() {
        return "student accomodation";
    }

    @Override
    String buildingMaterials() {
        return "concrete, wood, cladding, steel, carpet, glass";
    }

    @Override
    String buildingApproval() {
        return "yes";
    }


}
