public class BuilderDemo {
public static void main(String[] args) {
        // Building a gaming computer
        Computer gamingPC = new Computer.ComputerBuilder("Intel i9", "32GB")
                .storage("2TB NVMe SSD")
                .GPU("NVIDIA RTX 4090")
                .hasWifi(true)
                .hasBluetooth(true)
                .build();

        System.out.println("Gaming PC: " + gamingPC);

        // Building a basic office computer
        Computer officePC = new Computer.ComputerBuilder("Intel i5", "8GB")
                .hasWifi(true)
                .build();

        System.out.println("Office PC: " + officePC);

        // Building with defaults
        Computer basicPC = new Computer.ComputerBuilder("Intel i3", "4GB")
                .build();

        System.out.println("Basic PC: " + basicPC);
    }
}
