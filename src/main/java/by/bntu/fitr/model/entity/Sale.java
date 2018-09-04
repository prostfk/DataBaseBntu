package by.bntu.fitr.model.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sale {

    private Long id;
    private Date date;
    private Long performanceId;
    private Long placeId;

    public Sale() {
    }

    public Sale(Long id, String date, Long performanceId, Long placeId) {
        this.id = id;
        this.performanceId = performanceId;
        this.placeId = placeId;
        setDate(date);
    }

    public Sale(Long id, Date date, Long performanceId, Long placeId) {
        this.id = id;
        this.date = date;
        this.performanceId = performanceId;
        this.placeId = placeId;
    }

    public Sale(Date date, Long performanceId, Long placeId) {
        this.date = date;
        this.performanceId = performanceId;
        this.placeId = placeId;
    }

    public Sale(String date, Long performanceId, Long placeId) {
        setDate(date);
        this.performanceId = performanceId;
        this.placeId = placeId;
    }

    public String getDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    public void setDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.date = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", date=" + date +
                ", performanceId=" + performanceId +
                ", placeId=" + placeId +
                '}';
    }
}
