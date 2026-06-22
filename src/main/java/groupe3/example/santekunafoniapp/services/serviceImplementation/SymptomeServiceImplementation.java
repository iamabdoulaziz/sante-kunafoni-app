package groupe3.example.santekunafoniapp.services.serviceImplementation;

import groupe3.example.santekunafoniapp.Entity.Symptome;
import groupe3.example.santekunafoniapp.Repository.SymptomeRepository;
import groupe3.example.santekunafoniapp.services.serviceInterface.SymptomeServiceInterface;

import java.util.List;

public class SymptomeServiceImplementation implements SymptomeServiceInterface {

    private final SymptomeRepository repository;

    public SymptomeServiceImplementation(SymptomeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Symptome> getAllSymptome() {
        return repository.findAll()
                .orElseThrow(() ->
                    new RuntimeException("Liste non disponible"));
    }

    @Override
    public Symptome getSymptomeById(Long id) {
        return repository.findById()
                .orElseThrow(() ->
                        new RuntimeException("Symptôme introuvable"));
    }

    @Override
    public Symptome createSymptome(Symptome symptome) {
        return repository.save(symptome);
    }

    @Override
    public Symptome upadateSymptomeById(Long id, Symptome symptome) {
        return repository.save(symptome, id);
    }

    @Override
    public void deleteSymptomeById(Long id) {
    repository.deleteById(id);
    }
}
