package ClothesShop.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.NavbarDao;
import ClothesShop.Service.User.HomeServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	@Autowired
	NavbarDao navbarDao;

	public ModelAndView _mvShare = new ModelAndView();

	
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("menus", _homeService.GetDataMenus());
		_mvShare.addObject("navbar", navbarDao.GetProductNavbar());
		return _mvShare;
	}
	
}
