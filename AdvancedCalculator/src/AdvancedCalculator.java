public class AdvancedCalculator {
    public static void main(String[] args) throws Exception {
        
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Result: " + calc.add(5, 10));

        System.out.println("Result: " + calc.add(5, 10, 15));

        System.out.println("Result: " + calc.add(5.5, 10.2));

        System.out.println("Result: " + calc.add(new int[]{1,2,3,4}));
    
        System.out.println("Result: " + calc.add("Hello", "World"));

    }
            
    public int add(int a, int b) {  
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }

    public int add(int a, int b, int c) {  
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }

    public double add(double a, double b) {  
        System.out.println("Adding two doubles: " + a + " + " + b);
        return (double)(a + b);
    }

    public int add (int[] numbers) {  
        int sum = 0;
        System.out.print("Adding array of integers: ");
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public String add(String a, String b) {  
        System.out.println("Concatenating two strings: \"" + a + "\" + \"" + b + "\"");
        return a + b;
    }
}

