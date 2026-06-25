package groupe3.example.santekunafoniapp.Repository;

import groupe3.example.santekunafoniapp.Entity.Utilisateur;
import org.hibernate.internal.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByTel(String tel);
}
