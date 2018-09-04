package by.bntu.fitr.controller;

import by.bntu.fitr.dao.*;
import by.bntu.fitr.model.entity.Performance;
import by.bntu.fitr.model.entity.Poster;
import by.bntu.fitr.model.entity.Sale;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SaleDao saleDao = new SaleDao();
        PerformanceDao performanceDao = new PerformanceDao();
        PlaceDao placeDao = new PlaceDao();
        PosterDao posterDao = new PosterDao();
        System.out.println("Sales: ");
        System.out.println(saleDao.findAll());
        System.out.println("Performances: ");
        System.out.println(performanceDao.findAll());
        System.out.println("Places: ");
        System.out.println(placeDao.findAll());
        System.out.println("Posters: ");
        System.out.println(posterDao.findAll());


    }

}
