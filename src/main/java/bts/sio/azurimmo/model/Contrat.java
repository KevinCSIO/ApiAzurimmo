package bts.sio.azurimmo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "contrat")
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dateEntree")
    private LocalDate dateEntree;

    @Column(name = "dateSortie")
    private LocalDate dateSortie;

    @Column(name = "montantLoyer")
    private float montantLoyer;

    @Column(name = "montantCharges")
    private float montantCharges;

    @Column(name = "statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "appartement_id")
    private Appartement appartement;

    @ManyToOne
    @JoinColumn(name = "locataire_id")
    private Locataire locataire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(LocalDate dateEntree) {
        this.dateEntree = dateEntree;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public float getMontantLoyer() {
        return montantLoyer;
    }

    public void setMontantLoyer(float montantLoyer) {
        this.montantLoyer = montantLoyer;
    }

    public float getMontantCharges() {
        return montantCharges;
    }

    public void setMontantCharges(float montantCharges) {
        this.montantCharges = montantCharges;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Appartement getAppartement() {
        return appartement;
    }

    public void setAppartement(Appartement appartement) {
        this.appartement = appartement;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }
/*public Associe getAssocie() {
        return associe;
    }

    public void setAssocie(Associe associe) {
        this.associe = associe;
    }*/

    /*@ManyToOne
    @JoinColumn(name = "associe_id")
    private Associe associe;*/
}