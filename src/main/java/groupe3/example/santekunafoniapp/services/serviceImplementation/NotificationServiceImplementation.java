package groupe3.example.santekunafoniapp.Service;

import groupe3.example.santekunafoniapp.Entity.Notification;
import groupe3.example.santekunafoniapp.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService {

    private final NotificationRepository notificationRepository;

    // Injection via constructeur (recommandé)
    @Autowired
    public NotificationServiceImplementation(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    // Vos méthodes implémentées...
    public List<Notification> getNotificationsByUtilisateur(Long utilisateurId) {
        return notificationRepository.findByUtilisateur_Id(utilisateurId);
    }
}