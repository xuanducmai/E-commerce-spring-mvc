package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.Products_Admin_Dao;
import ClothesShop.Entity.ProductForAdmin;
import ClothesShop.Service.Admin.ProductAdServiceImpl;

@Controller
public class AdminProductController extends AdminBaseController {

	@Autowired
	private ProductAdServiceImpl productAdService = new ProductAdServiceImpl();
	@Autowired
	Products_Admin_Dao dao = new Products_Admin_Dao();

	@RequestMapping(value = "/admin/product_management/index")
	public ModelAndView Index() {
		ProductForAdmin entity = new ProductForAdmin();
		_mvShare.addObject("entity", entity);
		_mvShare.addObject("productAd", productAdService.GetAllProduct());
		_mvShare.setViewName("admin/product_management/index");
		return _mvShare;
	}

	@RequestMapping(value = "/admin/product_management/edit/{id_product}")
	public ModelAndView Edit(@PathVariable long id_product) {
		_mvShare.addObject("entity", dao.FindProductByID(id_product));
		_mvShare.addObject("productAd", productAdService.GetAllProduct());
		_mvShare.setViewName("admin/product_management/index");
		return _mvShare;
	}

	@RequestMapping(value = "/admin/product_management/create", method = RequestMethod.POST)
	public ModelAndView Create(Model model, @ModelAttribute("entity") ProductForAdmin entity) {
		dao.AddProductAd(entity);
		model.addAttribute("message", "Thêm mới thành công");
		_mvShare.setViewName("admin/product_management/index");
		return _mvShare;
	}

	@RequestMapping(value = "/admin/product_management/update", method = RequestMethod.POST)
	public ModelAndView Update(Model model, @ModelAttribute("entity") ProductForAdmin entity) {
		dao.EditProductAd(entity);
		model.addAttribute("message", "Cập nhật thành công!");
		_mvShare.setViewName("admin/product_management/index");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/product_management/delete" }, method = RequestMethod.POST)
	public ModelAndView Detele(Model model, @ModelAttribute("entity") ProductForAdmin entity) {
		dao.DeleteProductAd(entity);
		model.addAttribute("message", "Xóa thành công!");
		_mvShare.setViewName("admin/product_management/index");
		return _mvShare;
	}
	
}
