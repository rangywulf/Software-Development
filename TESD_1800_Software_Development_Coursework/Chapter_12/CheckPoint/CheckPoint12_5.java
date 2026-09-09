public class CheckPoint12_5 {
    /* 12.5.1
    Suppose you run the following code:
public static void main(String[] args) throws Exception2 {
  m(); 
  statement7;
}
     
public static void m() {
  try {
    statement1;
    statement2;
    statement3;
  }
  catch (Exception1 ex1) {
    statement4;
  }
  finally {
    statement5;
  }
  statement6;
}
answer the questions:
1. If no exception occurs, which statements are executed?
- 1,2,3,5,6,7
2. If statement2 throws an exception of type Exception1, which statements are executed?
- 1,2,4,5,6,7
3. If statement2 throws an exception of type Exception2, which statements are executed?
- 1, 2, 5
4. If statement2 throws an exception that is neither Exception1 nor Exception2, 
which statements are executed?
- 1, 2, 5
     */
}
