package exeptions;

public class StartWith555 extends Exception{
    public static final String START_WRONG = "Error. The number starts illegal elements";
    public StartWith555(String message) {
        super(message);
    }
}
