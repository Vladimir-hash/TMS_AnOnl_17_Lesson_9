package exeptions;

public class ContainsABC extends Exception{
    public static final String CONTAINS_WRONG = "Error. The number contains illegal elements";
    public ContainsABC(String message) {
        super(message);
    }
}
