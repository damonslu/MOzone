/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ozone.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ozone.conf.factory.CompanyFactory;
import ozone.domain.Company;
import za.ac.cput.company.model.Department;
import za.ac.cput.company.model.Subject;
import za.ac.cput.company.model.Company;
import ozone.service.CategoryService;
import ozone.service.ProductService;
import ozone.service.CustomerService;

/**
 *
 * @author Administrator
 */
public class CompanyTest {

    private static Long comapnyID;
    private static Long courseId;
    private CourseCrudService courseCrudService;
    private DepartmentService categoryService;
    private static ApplicationContext ctx;
    private CompanyCrudService companyCrudService;

    public CompanyTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:za/ac/cput/company/app/conf/applicationContext-*.xml");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCompanyCrud() {
        companyCrudService = (CompanyCrudService) ctx.getBean("companyCrudService");
        
        categoryService = (DepartmentService) ctx.getBean("categoryService");

        Map<String, String> values = new HashMap<String, String>();
        values.put("companyName", " CPUT");
        values.put("productName", " Informatics and Design");
        values.put("productCode", " FID");

        values.put("dept2", "PR");
        values.put("dept1", "IT");
        values.put("dept3", "DESIGN");

        Company company = AppFactory.createCompany(values);
        companyCrudService.persist(company);
        Assert.assertNotNull(company);
        companyID = company.getId();

        Department pr = categoryService.findDeptName("PR", companyID);
        Department design = categoryService.findDeptName("DESIGN", companyID);
        Department it = categoryService.findDeptName("IT", companyID);

        Subject tp = AppFactory.createSubject("Technical Programming", "TPG300S", new BigDecimal("3470.00"));
        Subject ds = AppFactory.createSubject("Development Software", "DOS300S", new BigDecimal("3470.00"));

        Course itCourse = AppFactory.createCourse("IT ND", "NDIP");

        Course course2 = AppFactory.createCourse("PR ND", "NDIP");

        Course course3 = AppFactory.createCourse("DESIGN ND", "NDIP");

        itCourse.getSubjects().add(tp);
        itCourse.getSubjects().add(ds);






        itCourse.setDept(it);


        //get a dept attach to course 
        courseCrudService = (CourseCrudService) ctx.getBean("courseCrudService");
        courseCrudService.persist(itCourse);

        // Persist 6 courses,
        //int courses = categoryService.getNumberOfCourses(it);
        Assert.assertEquals(2, it.getCourses());

        //



    }
}
