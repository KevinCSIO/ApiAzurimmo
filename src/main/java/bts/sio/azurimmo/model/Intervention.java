package bts.sio.azurimmo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "intervention")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateInter")
    private LocalDate dateInter;

    @Column(name = "description")
    private String description;

    @Column(name = "typeInter")
    private String typeInter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateInter() {
        return dateInter;
    }

    public void setDateInter(LocalDate dateInter) {
        this.dateInter = dateInter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeInter() {
        return typeInter;
    }

    public void setTypeInter(String typeInter) {
        this.typeInter = typeInter;
    }
}

