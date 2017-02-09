package my.project.autodealer.model;

/**
 * Created by Nikol on 2/8/2017.
 */
public class Car {
    MakerInfo makerInfo;
    OwnerInfo ownerInfo;

    public Car(MakerInfo makerInfo, OwnerInfo ownerInfo) {
        this.makerInfo = makerInfo;
        this.ownerInfo = ownerInfo;
    }

    public MakerInfo getMakerInfo() {
        return makerInfo;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }
}
