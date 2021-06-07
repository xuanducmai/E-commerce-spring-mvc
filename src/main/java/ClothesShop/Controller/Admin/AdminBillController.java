package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.Bills_Admin_Dao;
import ClothesShop.Service.Admin.BillAdServiceImpl;

@Controller
public class AdminBillController extends AdminBaseController {
	@Autowired
	private BillAdServiceImpl billAdService = new BillAdServiceImpl();
	@Autowired
	private Bills_Admin_Dao dao = new Bills_Admin_Dao();
	@RequestMapping(value = "/admin/bill_management/index")
	public ModelAndView Index() {
		_mvShare.addObject("bill", billAdService.GetAllBill());
		_mvShare.setViewName("admin/bill_management/index");
		return _mvShare;
	}
	@RequestMapping(value = "/admin/bill_management/edit/{id}")
	public ModelAndView Edit(@PathVariable long id) {
		_mvShare.addObject("billdetail", dao.GetBillDetailByID(id));
		_mvShare.addObject("bill", billAdService.GetAllBill());
		_mvShare.setViewName("admin/bill_management/index");
		return _mvShare;
	}
}
