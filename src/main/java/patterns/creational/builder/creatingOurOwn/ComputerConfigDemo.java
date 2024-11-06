package patterns.creational.builder.creatingOurOwn;

public class ComputerConfigDemo {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//
//        computer.setDiskSize(HDD.DEFAULT);
//        computer.setRamSize(RAM.DEFAULT);
//        computer.setHasGigWifiCard(true);
//        computer.setHasUsbTypeC(true);

        //ComputerTelescoping computer = new ComputerTelescoping(HDD.DEFAULT,RAM.DEFAULT,true,true);

        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addHdd(HDD.MAX).addRam(RAM.UPGRADED).hasC(true).hasGigWifi(true);

        Computer computer = builder.build();




        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.isHasGigWifiCard());
        System.out.println(computer.isHasUsbTypeC());
    }
}
