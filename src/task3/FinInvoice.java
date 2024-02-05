package task3;


import java.util.Date;

public class FinInvoice extends Document{
    int perMonthValue;
    String departmentCode;
    public FinInvoice(int perMonthValue, Date documentData, String documentNum, String departmentCode) {
        super(documentNum,  documentData);
        this.departmentCode = departmentCode;
        this.perMonthValue = perMonthValue;
    }
    public FinInvoice() {
        this(0, new Date(), "212", "Unknown date");

    }
    public String getDocNumber() {
        return documentNum;
    }

    public Date getDate() {
        return documentData;
    }
    @Override
    void getDisplayInfo() {
        System.out.println( "Document number: " + getDocNumber() + ": \n Date: " + getDate() + ". Per month value: " + perMonthValue + ". Department code: " + departmentCode);

    }

}
