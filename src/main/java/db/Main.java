package db;

//import ukrainian.Авторизація;
//import ukrainian.БазаДаних;

import adapter.Authorization;
import adapter.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorizationing(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
