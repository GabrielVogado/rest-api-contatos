package br.com.uniciv.contatosmaneger.repository;

import br.com.uniciv.contatosmaneger.model.Contatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Integer> {
}
