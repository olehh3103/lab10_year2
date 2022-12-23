package part1;

//import ukrainian.Авторизація;
//import ukrainian.БазаДаних;

import part2.ReportBuilder;
import part1.adapter.Authorization;
import part1.adapter.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorizationing(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
