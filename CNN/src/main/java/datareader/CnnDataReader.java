package datareader;

import databases.ConnectToSqlDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utility.ExcelReader;

public class CnnDataReader {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static ExcelReader excelReader = new ExcelReader();

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("business");
        itemsList.add("weather");
        itemsList.add("soccer");
        itemsList.add("baseball");
        itemsList.add("Entertainment");
        itemsList.add("Health");
        itemsList.add("politics");
        itemsList.add("opinion");

        return itemsList;
    }

    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    //Excel file
    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        //List<String> list = new ArrayList<String>(); ../Generic/browser-driver/chromedriver
        String path = "../Generic/src/main/java/utility/CnnDataReadFromExcel1.xls";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }
}
