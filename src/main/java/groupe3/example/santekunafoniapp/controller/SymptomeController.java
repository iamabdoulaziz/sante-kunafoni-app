package groupe3.example.santekunafoniapp.controller;

import groupe3.example.santekunafoniapp.Entity.Symptome;
import groupe3.example.santekunafoniapp.services.serviceInterface.SymptomeServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/symptomes")
public class SymptomeController {

    private final SymptomeServiceInterface service;

    public SymptomeController(SymptomeServiceInterface service) {
        this.service = service;
    }
    @GetMapping
    public List<Symptome> getAll(){
        return service.getAllSymptomes();
    }

}
