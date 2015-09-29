package ozone.domain;

import org.junit.Assert;
import org.junit.Test;
import ozone.conf.factory.AddressFactory;

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
