package groupe3.example.santekunafoniapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = false) // Ajout de cette ligne
@Table(name="patient")

public class Patient extends Utilisateur {
    @Id
    private int idUtilisateur;
    private String localite;
    private int age;
    private String etat;
    private String sexe;
    private Date periode;
}
