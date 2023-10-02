package tn.soretras.fromhtml.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import tn.soretras.fromhtml.domain.Categoria;

/**
 * Spring Data MongoDB repository for the Categoria entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {}
