package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Service.User.ContactServiceImpl;
import ClothesShop.Entity.Contact;

@Controller
public class ContactController extends BaseController {
	@Autowired
	ContactServiceImpl contactService = new ContactServiceImpl();
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView Index() {
		_mvShare.addObject("contact", new Contact());
		_mvShare.setViewName("user/contact/contact");
		return _mvShare;
	}
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ModelAndView CreateContact(@ModelAttribute("contact") Contact contact) {
		int count = contactService.AddContact(contact);
		if(count>0) {
			_mvShare.addObject("status", "Gửi phản hồi thành công!");
		}
		else {
			_mvShare.addObject("status", "Gửi phản hồi thất bại!");
		}
		_mvShare.setViewName("user/contact/contact");
		return _mvShare;
	}
}
