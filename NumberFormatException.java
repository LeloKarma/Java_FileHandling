import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberFormatException {
    public static void main(String[] args){
        if (args.length != 3) {
            System.out.println("You have to provide compute values in the format: 3 + 5 ");
            System.out.println(Arrays.toString(args));
            System.exit(1);
        }


        try{
            int value1 = Integer.parseInt(args[0]);
            char operand = args[1].charAt(0);
            int value2 = Integer.parseInt(args[2]);
            switch (operand){
                case '+' :
                    System.out.println(value1 +" + " +value2 +" = " + (value1 + value2)); break;
                case '-' :
                    System.out.println(value1 +" - " +value2 +" = " + (value1 - value2)); break;
                case '/' :
                    System.out.println(value1 +" / " +value2 +" = " + (value1 / value2)); break;
                case '*' :
                    System.out.println(value1 +" * " +value2 +" = " + (value1 * value2)); break;
                default:
                    System.out.println("The operand provided is not correct");
            }
        } catch (java.lang.NumberFormatException e) {
            System.out.println("The values entered should be intergers");
            System.exit(2);
        }

        // System.out.println("Val1: " +value1 + " Val2: " + value2 + " Operand: " + operand);



    }
}
