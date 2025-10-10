import java.security.MessageDigest;


public class StringUtil {

    // tldr: APPLIES SHA256 TO A STRING AND RETURNS THE RESULT.
    public static String applySha256(String input){

        // "try" shows code that might throw an exception
        try {
            
            // "MessageDigest" provides a fixed-size, one-way hash value
            //Applies sha256 to our input,
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Instantiates a new byte array
            // Calls MessageDigest method
            // Gets input string as bytes
            byte[] hash = digest.digest(input.getBytes("UTF-8"));

            // Instantiates a new StringBuffer
            // StringBuffer allows us to modify a string object without creating a new string
            // This is more efficient
            StringBuffer hexString = new StringBuffer();
            
            // "for" loop iterates through each byte in the byte array
            for (int i = 0; i < hash.length; i++) {

                // Converts each byte to a hexadecimal string
                String hex = Integer.toHexString(0xff & hash[i]);

                // "for" loop ensures each hex is 2 characters long
                if(hex.length() == 1) {
                    hexString.append('0');
                }

                // Appends the hex value to the StringBuffer
                hexString.append(hex);
            }
            // Returns the complete hash
            return hexString.toString();
        }

        // if a "try" block throws an exception, the "catch" block handles it
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
