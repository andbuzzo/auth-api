package br.com.d3h.authapi.repositories;

import br.com.d3h.authapi.domain.user.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Usuario, String> {
}
