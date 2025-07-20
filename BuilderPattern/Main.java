public class Main {
    public static void main(String[] args) {
        // Basic Computer
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                .build();
        basicComputer.showSpecs();

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOperatingSystem("Windows 11 Pro")
                .build();
        gamingComputer.showSpecs();

        // Office Computer
        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10")
                .build();
        officeComputer.showSpecs();
    }
}
