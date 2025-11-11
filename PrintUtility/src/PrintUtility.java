public class PrintUtility {
    public static void main(String[] args) throws Exception {

        PrintUtility util = new PrintUtility();

        System.out.println("Value: " + util.value(42));

        System.out.println(util.value(3.14));

        System.out.println("[ " + util.value(new int[]{1, 2, 3, 4, 5}) + " ]");

        System.out.println(util.value("Hello, World!"));

        System.out.println(util.value(3, 4));

        System.out.println(util.value(true));
    }

    public int value(int a){
        return a;
    }

    public double value(double a){
        return a;
    }

    public String value(int[] numbers){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String value(String str){
        return str;
    }

    public String value(int a, int b){
        return "Ratio: " + a  + ":" + b;
    }

    public String value(boolean bool){
        return String.valueOf(bool).toUpperCase();
    }
}
