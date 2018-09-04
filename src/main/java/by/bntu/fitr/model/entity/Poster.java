package by.bntu.fitr.model.entity;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Poster {

    private Long id;
    private Long performanceId;
    private Date date;
    private Date time;

    public Poster() {
    }

    public Poster(Long performanceId, Date date, Date time) {
        this.performanceId = performanceId;
        this.date = date;
        this.time = time;
    }

    public Poster(Long performanceId, String date, String time){
        this.performanceId = performanceId;
        setDate(date);
        setTime(time);

    }

    public Poster(Long id, Long performanceId, Date date, Date time) {
        this.id = id;
        this.performanceId = performanceId;
        this.date = date;
        this.time = time;
    }

    public Poster(Long id, Long performanceId, String date, String time) {
        this.id = id;
        this.performanceId = performanceId;
        setDate(date);
        setTime(time);
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

    public String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(this.time);
    }

    public void setTime(String time) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try {
            this.time = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", performanceId=" + performanceId +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
