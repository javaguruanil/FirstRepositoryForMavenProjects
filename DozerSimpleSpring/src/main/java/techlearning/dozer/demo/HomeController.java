package techlearning.dozer.demo;

import java.util.Locale;

import org.dozer.DozerBeanMapper;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Mapper mapper;   // ===> Autowiring Mapper(i) object 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/dozer", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Employee employee  = new Employee();
		employee.setId(1000);
		employee.setName("RMA");
		employee.setSalary(5000.0);
		employee.setAddress("Vellore Distrct");
		
		Person p= new Person();
		p.setpId(1);
		p.setpN("P1-Anil");
		
		employee.setPerson(p);
		
//		Mapper mapper =new DozerBeanMapper();   //===> By using DozerBeanMapper we can map all the attributes
		
//		Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance(); //===> By using this we can map our required DIFFERNT name attribute's 
		                                                               //     [i.e different variables with different names]
		EmployeeDTO employeeDTO =mapper.map(employee, EmployeeDTO.class);
		model.addAttribute("employeeDTOObj", employeeDTO);
		
		return "home";
	}
	
}
