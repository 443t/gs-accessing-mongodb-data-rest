package hello;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "pets", path = "pets")
public interface PetRepository extends MongoRepository<Pet, String> {

    List<Pet> findType(@Param("type") String type);

}