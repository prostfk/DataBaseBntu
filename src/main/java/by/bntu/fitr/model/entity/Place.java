package by.bntu.fitr.model.entity;

public class Place {

    private Long id;
    private Integer row;
    private Integer seat;
    private Integer price;

    public Place() {
    }

    public Place(Long id, Integer row, Integer seat, Integer price) {
        this.id = id;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", row=" + row +
                ", seat=" + seat +
                ", price=" + price +
                '}';
    }
}
