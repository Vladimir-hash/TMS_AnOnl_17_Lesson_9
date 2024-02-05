package exeptions;

public class EndWith1a2b extends Exception{
    public static final String END_WRONG = "Error. The number ends illegal elements";
    public EndWith1a2b(String message) {
        super(message);
    }
}
