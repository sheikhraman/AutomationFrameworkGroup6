package DagaBase;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {

        static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        public List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
            List<String> list = new ArrayList<>();
            list = connectToSqlDB.readDataBase("itemList", "searchItem");
            return list;
        }

        public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
//ins
            ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
            List<String> list = connectToSqlDB.readDataBase("itemList", "searchItem");
            for (String st : list) {
                System.out.println(st);
            }

        }
    }

