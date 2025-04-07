package ma.stagefinder.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.stagefinder.entities.enums.Role;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nom;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String tel;

    @Column(name = "cv_file")
    private String cvFile;

    @Column(name = "est_valide")
    private boolean estValide;

    private String adresse;
    private String logo;

    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy = "user")
    private List<Candidature> candidatures;

    @OneToMany(mappedBy = "user")
    private List<Offre> offres;
//
//    @OneToMany(mappedBy = "user")
//    private List<Favoris> favoris;
//
//    @OneToMany(mappedBy = "user")
//    private List<Abonnement> abonnements;

    @OneToMany(mappedBy = "user")
    private List<Notification> notifications;
}
