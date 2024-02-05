package task3;

import java.util.Date;

public class SupplyOfGoods extends Document{
    public String typeOfGoods;
    public int valueOfGoods;
    public SupplyOfGoods(String documentNum,String typeOfGoods, int valueOfGoods, Date documentData) {
        super(documentNum, documentData);
        this.typeOfGoods = typeOfGoods;
        this.valueOfGoods = valueOfGoods;
    }
    public SupplyOfGoods() {
        this("521", "Unknown goods", 2300, new Date());
    }
    public String getDocNumber() {
        return documentNum;
    }

    public Date getDate() {
        return documentData;
    }
    @Override
    void getDisplayInfo() {
        System.out.println("Document number: " + getDocNumber() + ": \n Date: " + getDate() + ". Value of goods: " + valueOfGoods + ". Type of goods: " + typeOfGoods);

    }
}

