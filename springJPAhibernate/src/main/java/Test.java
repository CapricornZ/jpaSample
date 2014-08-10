import java.util.Calendar;
import java.util.List;

import junit.framework.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.dao.CustomerDAO;
import com.jpa.model.Address;
import com.jpa.model.Customer;
import com.jpa.service.CustomerService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
		CustomerService service = (CustomerService)ctx.getBean("customerService");
	}

}
