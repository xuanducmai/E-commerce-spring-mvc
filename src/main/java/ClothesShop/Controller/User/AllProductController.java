package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dto.PaginatesDto;
import ClothesShop.Service.User.AllProductServiceImpl;
import ClothesShop.Service.User.PaginateServiceImpl;

@Controller
public class AllProductController extends BaseController {

	@Autowired
	private AllProductServiceImpl allProductServiceImpl;
	@Autowired
	private PaginateServiceImpl paginateService;

	private int totalProductsPage = 12;
	@RequestMapping(value = "/tat-ca-san-pham")
	public ModelAndView Product() {
		_mvShare.setViewName("user/products/allproduct");
		int totalData = allProductServiceImpl.GetAllProduct().size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", allProductServiceImpl.GetDataProductPaginate(paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
	
	
	@RequestMapping(value = "/tat-ca-san-pham/{currentPage}")
	public ModelAndView Product(@PathVariable String currentPage) {
		_mvShare.setViewName("user/products/allproduct");
		int totalData = allProductServiceImpl.GetAllProduct().size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", allProductServiceImpl.GetDataProductPaginate(paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
	
	@RequestMapping(value = "/list-view")
	public ModelAndView Index() {
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		int totalData = allProductServiceImpl.GetAllProduct().size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", allProductServiceImpl.GetDataProductPaginate(paginateInfo.getStart(), totalProductsPage));
		_mvShare.setViewName("user/products/list-view");
		return _mvShare;
	}
	
	@RequestMapping(value = "/list-view/{currentPage}")
	public ModelAndView Index(@PathVariable String currentPage) {
		int totalData = allProductServiceImpl.GetAllProduct().size();
		PaginatesDto paginateInfo = paginateService.GetInfoPaginates(totalData, totalProductsPage, Integer.parseInt(currentPage));
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginate", allProductServiceImpl.GetDataProductPaginate(paginateInfo.getStart(), totalProductsPage));
		_mvShare.setViewName("user/products/list-view");
		return _mvShare;
	}
}
