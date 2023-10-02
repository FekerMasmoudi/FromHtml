package tn.soretras.fromhtml.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.soretras.fromhtml.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
