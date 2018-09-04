package by.bntu.fitr.controller;

import by.bntu.fitr.dao.Dao;
import by.bntu.fitr.dao.PerformanceDao;
import by.bntu.fitr.dao.PlaceDao;

public class Main {

    public static void main(String[] args) {
        PlaceDao placeDao = new PlaceDao();
        System.out.println(placeDao.findAll());


    }

}
