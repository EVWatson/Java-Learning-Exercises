package More_oops;



public abstract class BuildingRequirements {

    abstract int numberOfStoreys();
    abstract int buildingCapacity();
    abstract String buildingPurpose();
    abstract String buildingMaterials();
    abstract String buildingApproval();



    Boolean isConstructionComplete() {
        return true;
    }


}
