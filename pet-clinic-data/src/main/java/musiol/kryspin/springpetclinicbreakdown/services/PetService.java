package musiol.kryspin.springpetclinicbreakdown.services;

import musiol.kryspin.springpetclinicbreakdown.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
