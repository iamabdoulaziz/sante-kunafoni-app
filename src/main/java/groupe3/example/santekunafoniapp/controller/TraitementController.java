package groupe3.example.santekunafoniapp.controller;

import groupe3.example.santekunafoniapp.DTO.TraitementDTO;
import groupe3.example.santekunafoniapp.Entity.Traitement;
import groupe3.example.santekunafoniapp.services.serviceImplementation.TraitementService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/traitements")
public class TraitementController {

    private final TraitementService service;

    public TraitementController(TraitementService service) {
        this.service = service;
    }

    @PostMapping
    public Traitement ajouter(@RequestBody TraitementDTO traitementDTO) {
        return service.ajouterTraitement(traitementDTO);
    }

    @GetMapping
    public List<Traitement> liste() {
        return service.getAllTraitements();
    }

    @GetMapping("/{id}")
    public Traitement trouver(@PathVariable Long id) {
        return service.getTraitementById(id)
                .orElseThrow(() -> new RuntimeException("Traitement non trouvé"));
    }

    @PutMapping("/{id}")
    public Traitement modifier(@PathVariable Long id, @RequestBody TraitementDTO traitementDTO) {
        return service.modifierTraitement(id, traitementDTO);
    }

    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id) {
        service.supprimerTraitement(id);
        return "Traitement supprimé avec succès";
    }
}