package by.bntu.fitr.dao;

import by.bntu.fitr.model.entity.Place;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlaceDao extends Dao{

    public List<Place> findAll(){
        ResultSet resultSet = executeWithResult("SELECT * FROM place");
        List<Place> places = new ArrayList<Place>();
        try {
            while (resultSet.next()){
                places.add(new Place(
                        resultSet.getLong("id"),resultSet.getInt("row"),
                        resultSet.getInt("seat"),resultSet.getInt("price")
                ));
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return places;
    }

}
