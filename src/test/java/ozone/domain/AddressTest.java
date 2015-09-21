package ozone.domain;

import ozone.domain.AddressFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hashcode on 2015/05/03.
 */
public class AddressTest {
    @Test
    public void testCreate() throws Exception {
        Address address = AddressFactory
                .createAddress("14 Bloemhof ","7557","60 POBOX");
        Assert.assertEquals("14 Bloemhof",address.getPAddress());
    }

    
    }
