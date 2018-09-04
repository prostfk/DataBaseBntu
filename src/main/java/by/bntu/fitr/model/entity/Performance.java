package by.bntu.fitr.model.entity;

public class Performance {

    private Long id;
    private String title;

    public Performance() {
    }

    public Performance(String title) {
        this.title = title;
    }

    public Performance(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", title='" + title + '\'' +
                "}";
    }
}
