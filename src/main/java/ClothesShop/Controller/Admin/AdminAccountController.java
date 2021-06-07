package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.Users_Admin_Dao;
import ClothesShop.Entity.Users;
import ClothesShop.Service.Admin.AccountAdServiceImpl;

@Controller
public class AdminAccountController extends AdminBaseController {
	@Autowired
	private AccountAdServiceImpl accountAdService = new AccountAdServiceImpl();
	@Autowired
	Users_Admin_Dao dao = new Users_Admin_Dao();

	@RequestMapping(value = "/admin/account_management/index")
	public ModelAndView Index() {
		Users entity = new Users();
		_mvShare.addObject("entity", entity);
		_mvShare.addObject("user", accountAdService.GetAllAccount());
		_mvShare.setViewName("admin/account_management/index");
		return _mvShare;
	}

	@RequestMapping(value = "/admin/account_management/edit/{id}")
	public ModelAndView Edit(@PathVariable long id) {
		_mvShare.addObject("entity", dao.FindAccountByID(id));
		_mvShare.addObject("user", accountAdService.GetAllAccount());
		_mvShare.setViewName("admin/account_management/index");
		return _mvShare;
	}

	@RequestMapping(value = "/admin/account_management/create", method = RequestMethod.POST)
	public ModelAndView Create(Model model, @ModelAttribute("entity") Users entity) {
		dao.AddAccountAd(entity);
		model.addAttribute("message", "Thêm mới thành công");
		_mvShare.setViewName("admin/account_management/index");
		return _mvShare;
	}

	@RequestMapping(value = "/admin/account_management/update", method = RequestMethod.POST)
	public ModelAndView Update(Model model, @ModelAttribute("entity") Users entity) {
		dao.EditAccountAd(entity);
		model.addAttribute("message", "Cập nhật thành công!");
		_mvShare.setViewName("admin/account_management/index");
		return _mvShare;
	}

	@RequestMapping(value = { "/admin/account_management/delete" }, method = RequestMethod.POST)
	public ModelAndView Detele(Model model, @ModelAttribute("entity") Users entity) {
		dao.DeleteAccountAd(entity);
		model.addAttribute("message", "Xóa thành công!");
		_mvShare.setViewName("admin/account_management/index");
		return _mvShare;
	}
}
