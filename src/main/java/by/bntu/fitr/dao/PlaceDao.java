package by.bntu.fitr.dao;

import by.bntu.fitr.model.entity.Place;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlaceDao extends Dao<Place>{

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

    public void save(Place place) {
        //language=SQL
        execute(String.format("INSERT INTO place(row, seat, price) VALUES('%d','%d','d')", place.getRow(),place.getSeat(),place.getPrice()));
    }
}
