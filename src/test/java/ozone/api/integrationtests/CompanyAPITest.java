package ozone.api.integrationtests;

import ozone.domain.*;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import ozone.App;
import ozone.domain.Address;

/**
 * Created by hashcode on 2015/08/21.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
@IntegrationTest({"server.port=8080"})
public class CompanyAPITest {
    private static Address address;
    private static Contact contact;
    private static List<Product> products;

    final String BASE_URL = "http://localhost:8080/";
    private RestTemplate template;

//    @Before
    public void setUp() throws Exception {
        template = new TestRestTemplate();
    }

//    @Test
    public void testRead() throws Exception {
        ResponseEntity<String> response =template.getForEntity(BASE_URL+"api/company/readall", String.class);

        System.out.println("The response is "+response.getBody());


    }

    public static final String REST_SERVICE_URI = "http://localhost:8080/api";

    /* GET */
    @SuppressWarnings("unchecked")
    private static void listAllCompanies(){
        System.out.println("Testing listAllCompanys API-----------");

        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> CompanysMap = restTemplate.getForObject(REST_SERVICE_URI+"/companys/", List.class);

        if(CompanysMap!=null){
            for(LinkedHashMap<String, Object> map : CompanysMap){
                System.out.println("Company : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
            }
        }else{
            System.out.println("No Company exist----------");
        }
    }

    /* GET */
    private static void getCompany(){
        System.out.println("Testing getCompany API----------");
        RestTemplate restTemplate = new RestTemplate();
        Company Company = restTemplate.getForObject(REST_SERVICE_URI+"/company/1", Company.class);
        System.out.println(Company);
    }

    /* POST */
    private static void createCompany() {
        System.out.println("Testing create Company API----------");
        RestTemplate restTemplate = new RestTemplate();
        Address compAddress = new Address.Builder("9586").physicalAddress("23 Cattle Street").postalAddress("23 POBOX")
                .build();
        Contact compContact = new Contact.Builder("83494939").cellNumber("83939399").email("specsavers@gmail.com")
                .build();
        Product compProducts = new Product.Builder(400).setQuantity(3).setDescription("Kiddies specs")
                .build();
        Company Company = new Company.Builder("Specsavers").address(compAddress).contact(compContact).products((List<Product>) compProducts)
                .build();
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/company/create/", Company, Company.class);
        System.out.println("Location : "+uri.toASCIIString());
    }

    /* PUT */
    private static void updateCompany() {
        //public Address() address = new Address(); 
        System.out.println("Testing update Company API----------");
        RestTemplate restTemplate = new RestTemplate();
        Company Company  =  new Company.Builder("SpecWinners").address(address).contact(contact).products((List<Product>) products)
                .build();
        restTemplate.put(REST_SERVICE_URI+"/company/update/1", Company);
        System.out.println(Company);
    }

    /* DELETE */
    private static void deleteCompany() {
        System.out.println("Testing delete Company API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/company/delete/3");
    }


    /* DELETE */
    private static void deleteAllCompanys() {
        System.out.println("Testing all delete Companys API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI + "/company/");
    }

}
