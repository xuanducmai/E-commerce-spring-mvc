package ClothesShop.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.CompairDao;
import ClothesShop.Dto.CartDto;
import ClothesShop.Dto.ProductsDto;
import ClothesShop.Service.User.CompairServiceImpl;

@Controller
public class CompairController extends BaseController {
	@Autowired
	CompairServiceImpl compairService = new CompairServiceImpl();
	@Autowired
	CompairDao dao = new CompairDao();
	@RequestMapping(value = "/so-sanh" )
	public ModelAndView Index() {
		_mvShare.setViewName("user/compair/compair");
		return _mvShare;
	}
	
	@RequestMapping(value = "/Add-Compare/{id}")
	public String AddCompare(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, ProductsDto> compair = (HashMap<Long, ProductsDto>) session.getAttribute("compair");
		if (compair == null) {
			compair = new HashMap<Long, ProductsDto>();
		}
		compair = dao.Add1(id, compair);
		session.setAttribute("compair", compair);
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "/Delete-Compare/{id}")
	public String DeleteCompare(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, ProductsDto> compair = (HashMap<Long, ProductsDto>) session.getAttribute("compair");
		if (compair == null) {
			compair = new HashMap<Long, ProductsDto>();
		}
		compair = dao.Delete1(id, compair);
		session.setAttribute("compair", compair);
		return "redirect:" + request.getHeader("Referer");
	}
}
