package part1.adapter;

import part1.ukrainian.Авторизація;

public class Authorization extends Авторизація {

    public boolean authorizationing (DataBase db) {
        return авторизуватися(db);
    }

}