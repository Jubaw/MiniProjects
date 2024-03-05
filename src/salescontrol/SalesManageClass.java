package salescontrol;

import java.util.ArrayList;
import java.util.List;

public class SalesManageClass {
    private List<Sale> sales;

    public SalesManageClass(){
        this.sales = new ArrayList<>();
    }
    public void addSale(Sale sale){
        sales.add(sale);
    }

    public List<Sale> getSales(){
        return sales;
    }

}
