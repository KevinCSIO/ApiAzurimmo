package bts.sio.azurimmo.dto;

import bts.sio.azurimmo.model.Batiment;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BatimentDto {
    private Integer id;
    private String adresse;
    private String ville;

    public void updateTo(Batiment batiment){
        batiment.setAdresse(adresse);
        batiment.setVille(ville);
    }
}
