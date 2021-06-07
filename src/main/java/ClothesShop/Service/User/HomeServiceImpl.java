package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.CategorysDao;
import ClothesShop.Dao.MenuDao;
import ClothesShop.Dao.ProductsDao;
import ClothesShop.Dao.SlidesDao;
import ClothesShop.Dto.ProductsDto;
import ClothesShop.Entity.Categorys;
import ClothesShop.Entity.Menus;
import ClothesShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private ProductsDao productsDao;
	@Autowired
	private MenuDao menuDao;
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categorysDao.GetDataCategorys();
	}
	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}

}