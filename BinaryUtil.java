/*
Created by Lelokarma
  */
import java.util.NumberFormatException;

public class BinaryUtil {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;
        
        try {
            decimal = Integer.parseInt(binaryString, 2);
        } catch (NumberFormatException e) {
            throw new BinaryFormatException("Invalid binary string: " + binaryString);
        }
        
        return decimal;
    }
}
