package patterns.creational.builder.creatingOurOwn;

public class ComputerTelescoping {

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbTypeC;
    private boolean hasGigWifiCard;

    public ComputerTelescoping(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public ComputerTelescoping(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize) {//telescoping constructors / overloaded constructors
        this(ramSize);
        this.diskSize = diskSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasGigWifiCard) {
        this(diskSize,ramSize);
        this.hasGigWifiCard = hasGigWifiCard;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasUsbTypeC, boolean hasGigWifiCard) {
        this(diskSize, ramSize, hasGigWifiCard);
        this.hasUsbTypeC = hasUsbTypeC;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean isHasUsbTypeC() {
        return hasUsbTypeC;
    }

    public boolean isHasGigWifiCard() {
        return hasGigWifiCard;
    }
}
