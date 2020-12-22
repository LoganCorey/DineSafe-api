package com.toronto.dinesafe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@SpringBootTest
class EstablishmentSearchTests {
     @Autowired
    private EstablishmentRepository repository;

   @Test
    public void findEstablishmentByName() {
       EstablishmentSpecificationsBuilder builder = new EstablishmentSpecificationsBuilder();
       SpecSearchCriteria spec = new SpecSearchCriteria("establishmentName", SearchOperation.EQUALITY, "SAI-LILA KHAMAN DHOKLA HOUSE");
       List<Establishment> results = repository.findAll(builder
               .with(spec)
               .build());
        assertThat(results, hasSize(greaterThan(1)));
    }

    @Test
    public void findResturantsWithAmountFinedMoreThanZero() {
        EstablishmentSpecificationsBuilder builder = new EstablishmentSpecificationsBuilder();
        SpecSearchCriteria spec = new SpecSearchCriteria("amountFined", SearchOperation.GREATER_THAN, 0);
        SpecSearchCriteria spec1 = new SpecSearchCriteria("'", "establishmentType", SearchOperation.EQUALITY, "Restaurant");
        List<Establishment> results = repository.findAll(builder
                .with(spec)
                .with(spec1)
                .build());
        assertThat(results, hasSize(greaterThan(1)));
    }

}
