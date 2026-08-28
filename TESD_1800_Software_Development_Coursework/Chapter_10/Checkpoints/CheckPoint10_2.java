package Chapter_10.Checkpoints;

public class CheckPoint10_2 {
    /* 10.2.1
    If you redefine the Loan class without setter methods, is the class immutable? 
    No. The Loan class has the getLoanDate() method that returns loanDate. loanDate is an object of the Date class.
    Since Date is mutable, the contents of loanDate can be changed. So, the Loan class is not immutable*/
}
