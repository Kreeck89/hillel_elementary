package lesson17.entities;

import javax.persistence.*;

@Entity
@Table(name = "subs")
public class Sub {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String type;

    @Embedded
    private InnerField field;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InnerField getField() {
        return field;
    }

    public void setField(InnerField field) {
        this.field = field;
    }
}
