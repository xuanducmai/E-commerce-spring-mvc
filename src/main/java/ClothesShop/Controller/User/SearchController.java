package ClothesShop.Controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.SearchDao;
import ClothesShop.Dto.ProductsDto;

@Controller
public class SearchController extends BaseController{
		@Autowired
		private SearchDao dao = new SearchDao();
		
		@RequestMapping(value =  "/search" )
		public ModelAndView Index(Model model,@RequestParam(required=false,value="keyword") String keyword) {
			List<ProductsDto> rs = dao.Search(keyword);
			if(keyword!=null) {
				_mvShare.addObject("keyword", rs);
			}

			String title = "Kết quả tìm kiếm cho  '"+keyword+"'";
			_mvShare.addObject("title", title);
			_mvShare.setViewName("user/search/search");
			return _mvShare;
		}

}

