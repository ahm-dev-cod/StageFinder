package ma.stagefinder.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.stagefinder.entities.enums.StatutCandidature;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_de_candidature")
    private LocalDateTime dateCandidature;

    @Enumerated(EnumType.STRING)
    private StatutCandidature statutCandidature;

    @Column(name = "lettre_de_motivation")
    private String lettreMotivation;

    @Column(name = "cv_choisi")
    private String cvChoisi;

    private String commentaires;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "offre_id")
//    private Offre offre;
}
