package com.toronto.dinesafe;

import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@SpringBootTest
class EstablishmentSearchTests {
   /*  @Autowired
    private IEstablishmentDAO userApi;

   @Test
    public void givenFirstAndLastName_whenGettingListOfUsers_thenCorrect() {
        List<SearchCriteria> params = new ArrayList<SearchCriteria>();
        params.add(new SearchCriteria("establishmentName", ":", "SAI-LILA KHAMAN DHOKLA HOUSE"));

        List<Establishment> results = userApi.searchEstablishment(params);
        assertThat(results, hasSize(1));
    }*/

}
