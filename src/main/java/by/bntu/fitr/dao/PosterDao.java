package by.bntu.fitr.dao;

import by.bntu.fitr.model.entity.Poster;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PosterDao extends Dao<Poster> {


    public void save(Poster poster) {
        //language=SQL
        execute(String.format("INSERT INTO poster(performance_id, performance_date, performance_time) VALUES('%d','%s','%s')",poster.getPerformanceId(), poster.getDate(),poster.getTime()));
    }

    public List<Poster> findAll() {
        List<Poster> posters = new ArrayList<Poster>();
        ResultSet resultSet = executeWithResult("SELECT * FROM poster");
        try{
            while (resultSet.next()){
                posters.add(new Poster(
                        resultSet.getLong("id"),resultSet.getLong("performance_id"),
                        resultSet.getString("performance_date"),resultSet.getString("performance_time")
                ));
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return posters;
    }


}
