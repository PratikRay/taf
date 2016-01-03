package w3schools;


import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Pratik on 1/2/2016.
 */
public class TableData extends Base {

    @Test
    public void getTableData(){
        String text = getTextByCss(".table-responsive tbody tr:nth-child(5)");
        System.out.println(text);
    }
}
