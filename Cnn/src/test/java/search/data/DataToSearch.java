package search.data;

import org.testng.annotations.DataProvider;

/**
 * Created by Pratik on 1/2/2016.
 */
public class DataToSearch {

    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Politics"},
                {"Money"},
                {"Tech"}
        };
    }
}
