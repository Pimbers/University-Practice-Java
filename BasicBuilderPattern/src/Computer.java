public class Computer {
 // Required parameters (final for immutability)
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final String storage;
    private final String GPU;
    private final boolean hasWifi;
    private final boolean hasBluetooth;

    // Private constructor - only Builder can create
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Getters only (no setters - immutable)
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU() { return GPU; }
    public boolean hasWifi() { return hasWifi; }
    public boolean hasBluetooth() { return hasBluetooth; }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                ", hasWifi=" + hasWifi +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }

    // Static nested Builder class
    public static class ComputerBuilder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters - initialised to default values
        private String storage = "256GB SSD";
        private String GPU = "Integrated";
        private boolean hasWifi = false;
        private boolean hasBluetooth = false;

        // Constructor with required parameters
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Methods for optional parameters - return this for chaining
        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder hasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public ComputerBuilder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build method creates and returns the Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
