public class LazySingletonTest {
    public static void main(String[] args) {
        System.out.println("Testing LazySingleton...");
        System.out.println("Working...");
        // Get the only instance of LazySingleton
        
        System.out.println("Getting first instance");
        LazySingleton singleton1 = LazySingleton.getInstance();
        
        
        System.out.println("Getting second instance");
        LazySingleton singleton2 = LazySingleton.getInstance();

        // Show message from the singleton instance
        singleton1.showMessage();

        // Verify that both references point to the same instance
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
