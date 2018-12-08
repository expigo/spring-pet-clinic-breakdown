package musiol.kryspin.springpetclinicbreakdown.services;

import musiol.kryspin.springpetclinicbreakdown.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
