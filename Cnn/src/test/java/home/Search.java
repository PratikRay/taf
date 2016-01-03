
package home;

import CommonApi.Base;
import org.testng.annotations.Test;
import search.data.DataToSearch;

/**
 * Created by Pratik on 12/26/2015.
 */
public class Search extends Base {

    //DataToSearch dataToSearch = new DataToSearch();
    @Test()
    public void test1(){
        clickByCss("#search-button");
        typeByCss("#search-input-field", "politics");
    }
}


