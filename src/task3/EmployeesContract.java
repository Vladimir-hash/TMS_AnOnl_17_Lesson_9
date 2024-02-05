package task3;

import java.util.Date;

public class EmployeesContract extends Document  {
    public  Date contractEnding;
    public String name;
    public EmployeesContract(String documentNum, Date documentData, Date contractEnding, String name) {
        super(documentNum, documentData);
        this.contractEnding = contractEnding;
        this.name = name;
    };
    public EmployeesContract() {
        this("0", new Date(), new Date(), "Unknown person");
    }
    public String getDocNumber() {
        return documentNum;
    }

    public Date getDate() {
        return documentData;
    }
    @Override
     void getDisplayInfo() {
            System.out.println("Document number: " + getDocNumber() + ":\n Date: " + getDate() + ". Date of the contract ending: " + contractEnding + ". Employee's name: " + name);
    }
}
