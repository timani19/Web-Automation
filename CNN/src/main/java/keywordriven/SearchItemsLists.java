package keywordriven;

import utility.ExcelReader;

import java.io.IOException;
import base.CommonApi;

public class SearchItemsLists extends CommonApi {
    ExcelReader dr = new ExcelReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"data/cnnKeyword.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"/data/cnnKeyword.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
