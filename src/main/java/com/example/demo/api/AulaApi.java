package com.example.demo.api;
import com.example.demo.model.Aula;
import com.example.demo.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class AulaApi {

    @Autowired
    private AulaRepository aulaRepository;

    @PostMapping("/aula")
    public Aula salvar(@RequestBody Aula aula){
        return aulaRepository.save(aula);
    }

    @GetMapping("/aula/{id}") //localhost:8080/api/1
        public Aula getAula(@PathVariable("id") Long id){
        return aulaRepository.findById(id).get();
    }

    @GetMapping("/aula")

      public List<Aula> getAulas(){
          return aulaRepository.findAll();
        }

       @GetMapping("/aula/{id}")
       public void deletar(Long id){
           aulaRepository.deleteById(id);

       }
}






