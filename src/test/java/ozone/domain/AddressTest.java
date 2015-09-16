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
                .createAddress("14 bloemhof ","7557","60 POBOX");
        Assert.assertEquals("14 Bloemhof",address.getPAddress());
    }

    @Test
    public void testUpdate() throws Exception {
        Address address = AddressFactory
                .createAddress("14 Bloemhof","7557","60 POBOX");

      /*Address copiedaddress = new Address
                .Builder("test@test.comm").copy(address).copy(address("700").build();
        Assert.assertEquals("test@test.com",address.getPAddress();
        Assert.assertEquals("test@test.com",copiedaddress.getPAddress();
        Assert.assertEquals("7557",address.getPostalCode());
        Assert.assertEquals("700",copiedaddress.getPostalCode());*/

    }
}
