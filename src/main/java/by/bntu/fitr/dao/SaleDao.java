package by.bntu.fitr.dao;

import by.bntu.fitr.model.entity.Sale;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SaleDao extends Dao<Sale> {



    public void save(Sale sale) {
        //language=SQL
        execute(String.format("INSERT INTO sale(date_of_sale, performance_id, place_id) VALUES ('%s','%d','%d')",sale.getDate(),sale.getPerformanceId(),sale.getPlaceId()));
    }

    public List<Sale> findAll() {
        List<Sale> sales = new ArrayList<Sale>();
        ResultSet resultSet = executeWithResult("SELECT * FROM sale");
        try{
            while (resultSet.next()){
                sales.add(new Sale(
                        resultSet.getLong("id"),resultSet.getString("date_of_sale"),
                        resultSet.getLong("performance_id"),resultSet.getLong("place_id")
                ));
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return sales;
    }


}
