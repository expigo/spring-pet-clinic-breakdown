package musiol.kryspin.springpetclinicbreakdown.bootstrap;

import musiol.kryspin.springpetclinicbreakdown.model.Owner;
import musiol.kryspin.springpetclinicbreakdown.model.PetType;
import musiol.kryspin.springpetclinicbreakdown.model.Vet;
import musiol.kryspin.springpetclinicbreakdown.services.OwnerService;
import musiol.kryspin.springpetclinicbreakdown.services.PetTypeService;
import musiol.kryspin.springpetclinicbreakdown.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {  // will get to run when the whole Spring app context is up and ready

        PetType dog = new PetType();
        dog.setName("Dog");
        final PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        final PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Kryspin");
        owner1.setLastName("Musiol");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michael");
        owner2.setLastName("Jackson");
        ownerService.save(owner2);

        Vet vet1= new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Mas");
        vet2.setLastName("Knife");
        vetService.save(vet2);

    }
}
