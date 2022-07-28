package validatorpkg;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/hello")
	public String display(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "viewpage";
	}
	@RequestMapping("/helloagain")
	public String submitForm( @Valid @ModelAttribute("emp") Employee e, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "viewpage";
		}
		else
		{
		return "final";
		}
	}
}
