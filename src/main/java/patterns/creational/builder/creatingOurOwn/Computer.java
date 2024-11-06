package patterns.creational.builder.creatingOurOwn;

public class Computer {

    public static class ComputerBuilder{
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbTypeC;
        private boolean hasGigWifiCard;


        public ComputerBuilder(){

        }

        public Computer build(){
            return new Computer(this);
        }

       public ComputerBuilder addRam(RAM ramSize){
            this.ramSize = ramSize;
            return this;
       }

       public ComputerBuilder addHdd(HDD diskSize){
            this.diskSize = diskSize;
            return this;
       }

       public ComputerBuilder hasC(boolean hasUsbTypeC){
            this.hasUsbTypeC = hasUsbTypeC;
            return this;
       }

       public ComputerBuilder hasGigWifi(boolean hasGigWifiCard){
            this.hasGigWifiCard = hasGigWifiCard;
            return this;
       }

    }





    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbTypeC;
    private boolean hasGigWifiCard;




    public Computer(ComputerBuilder computerBuilder){
        this.diskSize = computerBuilder.diskSize;
        this.ramSize = computerBuilder.ramSize;
        this.hasUsbTypeC = computerBuilder.hasUsbTypeC;
        this.hasGigWifiCard = computerBuilder.hasGigWifiCard;
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
