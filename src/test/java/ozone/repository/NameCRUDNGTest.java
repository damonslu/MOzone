package ozone.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ozone.App;
import ozone.conf.factory.NameFactory;
import ozone.domain.Name;

/**
 * Created by hashcode on 2015/04/13.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class NameCRUDNGTest extends AbstractTestNGSpringContextTests{
    private Long id;

    @Autowired
    private NameRepository repository;
    @Test
    public void create() throws Exception {
        //System.out.println("Hello world");
        Name name = NameFactory.createName("Zack", "DuPeez");
             repository.save(name);
             Assert.assertNotNull(name);
    }
    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        Name name = repository.findOne(id);
        Assert.assertNotNull(name);
    }
 @Test(dependsOnMethods = "read")
    public void update() throws Exception {

    }
     /*@Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }
    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        Name name = repository.findOne(id);
        repository.delete(name);
        Name deletedname = repository.findOne(id);
        Assert.assertNull(deletedname);
    }*/
    }   

               
        