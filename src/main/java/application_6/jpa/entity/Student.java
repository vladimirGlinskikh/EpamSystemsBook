package application_6.jpa.entity;

import javax.persistence.Id;
import java.io.Serializable;

public class Student implements Serializable {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
