package bts.sio.azurimmo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "appartement")
public class Appartement {

    @ManyToOne
    @JoinColumn(name = "batiment_id")
    private Batiment batiment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="numero")
    private int numero;

    @Column(name="surface")
    private float surface;

    @Column(name="nbPieces")
    private int nbPieces;

    @Column(name="description")
    private String description;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Batiment getBatiment() {
        return batiment;
    }

    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }

}