package springJPAhibernate;

import java.util.Calendar;  
import java.util.List;  

import junit.framework.Assert;  

import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.jpa.dao.CustomerDAO;
import com.jpa.model.Address;
import com.jpa.model.Customer;
  
  
public class CustomerDAOJPAImplTest {
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");  
        customerDAO = (CustomerDAO)ctx.getBean("customerDAO");
        for (int i = 0; i < 10; i++) {  
            Customer customer = new Customer();  
            customer.setName("customer_" + i);  
            customer.setEmail("customer_" + i + "@my.com");  
            customer.setBirthday(Calendar.getInstance().getTime());  
              
            Address addressHome = new Address();  
            addressHome.setName("Home");  
            addressHome.setDescription("Home");  
            addressHome.setZipcode("123456");  
              
            Address addressOffice = new Address();  
            addressOffice.setName("Office");  
            addressOffice.setDescription("Office");  
            addressOffice.setZipcode("654321");  
              
            customer.addAddress(addressHome);  
            customer.addAddress(addressOffice);  
            customerDAO.add(customer);  
        }  
		
	}
    private static CustomerDAO customerDAO;  
      
    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");  
        customerDAO = (CustomerDAO)ctx.getBean("customerDAO");  
          
        for (int i = 0; i < 10; i++) {  
            Customer customer = new Customer();  
            customer.setName("customer_" + i);  
            customer.setEmail("customer_" + i + "@my.com");  
            customer.setBirthday(Calendar.getInstance().getTime());  
              
            Address addressHome = new Address();  
            addressHome.setName("Home");  
            addressHome.setDescription("Home");  
            addressHome.setZipcode("123456");  
              
            Address addressOffice = new Address();  
            addressOffice.setName("Office");  
            addressOffice.setDescription("Office");  
            addressOffice.setZipcode("654321");  
              
            customer.addAddress(addressHome);  
            customer.addAddress(addressOffice);  
            customerDAO.add(customer);  
        }  
    }  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
    }  
    @Before  
    public void setUp() throws Exception {  
          
    }  
    @After  
    public void tearDown() throws Exception {  
    }  
    @Test  
    public void testFindById() {  
        List<Customer> customers = customerDAO.list();  
        for (Customer customer : customers) {  
            Customer anotherCustomer = customerDAO.findById(customer.getId());  
            Assert.assertNotNull(anotherCustomer);  
            Assert.assertEquals(customer.getId(), anotherCustomer.getId());  
            Assert.assertEquals(customer.getName(), anotherCustomer.getName());  
        }  
    }  
      
    @Test  
    public void testAdd() {  
        Customer customer = new Customer();  
        customer.setName("customer_abc");  
        customer.setEmail("customer_abc" + "@my.com");  
        customer.setBirthday(Calendar.getInstance().getTime());  
          
        Address addressHome = new Address();  
        addressHome.setName("Home");  
        addressHome.setDescription("Home");  
        addressHome.setZipcode("123456");  
          
        Address addressOffice = new Address();  
        addressOffice.setName("Office");  
        addressOffice.setDescription("Office");  
        addressOffice.setZipcode("654321");  
          
        customer.addAddress(addressHome);  
        customer.addAddress(addressOffice);  
        Customer persistedCustomer = customerDAO.add(customer);  
          
        Assert.assertNotNull(customer);  
        Assert.assertEquals(customer.getName(), persistedCustomer.getName());  
    }  
    @Test  
    public void testList() {  
        List<Customer> customers = customerDAO.list();  
        Assert.assertEquals(true, customers.size() > 0);  
    }  
}  