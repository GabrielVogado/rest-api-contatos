package br.com.uniciv.contatosmaneger.controller;

import br.com.uniciv.contatosmaneger.model.Contatos;
import br.com.uniciv.contatosmaneger.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatoController {

    @Autowired
    private ContatosRepository contatosRepository;

    @GetMapping("/contatos")
    public List<Contatos> getListContatos(){
        return contatosRepository.findAll();

    }

    @PostMapping("/salvarContatos")
    public Contatos createContato(@RequestBody Contatos contatos){
        return contatosRepository.save(contatos);
    }
}
