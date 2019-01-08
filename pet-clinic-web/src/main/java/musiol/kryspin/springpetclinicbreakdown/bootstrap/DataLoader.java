package musiol.kryspin.springpetclinicbreakdown.bootstrap;

import musiol.kryspin.springpetclinicbreakdown.model.Owner;
import musiol.kryspin.springpetclinicbreakdown.model.Vet;
import musiol.kryspin.springpetclinicbreakdown.services.OwnerService;
import musiol.kryspin.springpetclinicbreakdown.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {  // will get to run when the whole Spring app context is up and ready

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Kryspin");
        owner1.setLastName("Musiol");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Michael");
        owner2.setLastName("Jackson");
        ownerService.save(owner2);

        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Mas");
        vet2.setLastName("Knife");
        vetService.save(vet2);

    }
}
