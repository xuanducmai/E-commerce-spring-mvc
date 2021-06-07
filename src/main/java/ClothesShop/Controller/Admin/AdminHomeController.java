package ClothesShop.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Controller.User.BaseController;

@Controller
public class AdminHomeController extends BaseController{

	@RequestMapping(value = { "/admin" })
	public ModelAndView Index() {
		_mvShare.setViewName("/admin/index");
		return _mvShare;
	}
}
