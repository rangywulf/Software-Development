public class CheckPoint12_6 {
    /* 12.6.1
    The following method tests whether a string is a numeric string:
public static boolean isNumeric(String token) {
  try {
    Double.parseDouble(token);
    return true;
  }
  catch (java.lang.NumberFormatException ex) {
    return false;
  }
}
Is it correct? Rewrite it without using exceptions.

Yes. it is correct. But a better way to write this method is using regular expression to test
if the string is numeric.
     */
}
