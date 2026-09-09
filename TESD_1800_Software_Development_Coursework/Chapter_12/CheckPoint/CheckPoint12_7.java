public class CheckPoint12_7 {
    /* 12.7.1
    Suppose that statement2 may cause an exception in the following code:
try {
  statement1;
  statement2;
  statement3;
}
catch (Exception1 ex1) {
}
catch (Exception2 ex2) {
  throw ex2;
}
finally {
  statement4;
}
statement5;
Answer the following questions:
1. If no exception occurs, will statement4 be executed, and will statement5 be executed?
yes
2. If the exception is of type Exception1, will statement4 be executed, 
and will statement5 be executed?
yes to both
3. If the exception is of type Exception2, will statement4 be executed, 
and will statement5 be executed?
Yes and no. 5 will not be exectured because it is rethrown to the caller
4. If the exception is not Exception1 nor Exception2, will statement4 be executed, 
and will statement5 be executed?
yes and no
    */
}
