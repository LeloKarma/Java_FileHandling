/*
Created by leloKarma
  */
import java.io.NumberFormatException;

public class HexUtil {
    public static int hex2Dec(String hexString) throws HexFormatException {
        int decimal = 0;
        
        try {
            decimal = Integer.parseInt(hexString, 16);
        } catch (NumberFormatException e) {
            throw new HexFormatException("Invalid hex string: " + hexString);
        }
        
        return decimal;
    }
}
