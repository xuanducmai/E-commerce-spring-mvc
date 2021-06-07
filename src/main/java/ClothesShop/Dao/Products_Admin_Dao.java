package ClothesShop.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.MapperProductForAdmin;
import ClothesShop.Entity.ProductForAdmin;


@Repository
public class Products_Admin_Dao extends BaseDao{

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_catogory ");
		sql.append(", p.sizes ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.title ");
		sql.append(", p.highlight ");
		sql.append(", p.new_product ");
		sql.append(", p.details ");
		sql.append("FROM ");
		sql.append("products AS p ");
		return sql;
	}
	private StringBuffer SqlAllProduct() {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		return sql;
	}
	public List<ProductForAdmin> GetAllProduct() {
		String sql = SqlAllProduct().toString();
		List<ProductForAdmin> listProducts = _jdbcTemplate.query(sql, new MapperProductForAdmin());
		return listProducts;
	}
	private StringBuffer SqlProductByID(long id_product) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = "+id_product + " ");
		sql.append("LIMIT 1 ");
		return sql;
	}
	public ProductForAdmin FindProductByID(long id_product) {
		String sql = SqlProductByID(id_product).toString();
		ProductForAdmin product = _jdbcTemplate.queryForObject(sql, new MapperProductForAdmin());
		return product;
	}

	public int AddProductAd(ProductForAdmin productAd) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO products ");
		sql.append("( ");
		sql.append("    id_catogory, ");
		sql.append("    sizes, ");
		sql.append("    name, ");
		sql.append("    price, ");
		sql.append("    sale, ");
		sql.append("    title, ");
		sql.append("    highlight, ");
		sql.append("    new_product, ");
		sql.append("    details ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+productAd.getId_catogory()+"', ");
		sql.append("    '"+productAd.getSizes()+"', ");
		sql.append("    '"+productAd.getName()+"', ");
		sql.append("    '"+productAd.getPrice()+"', ");
		sql.append("    '"+productAd.getSale()+"', ");
		sql.append("    '"+productAd.getTitle()+"', ");
		sql.append("    '"+productAd.getHighlight()+"', ");
		sql.append("    '"+productAd.getNew_product()+"', ");
		sql.append("    '"+productAd.getDetails()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	public int EditProductAd(ProductForAdmin productAd) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE ");
		sql.append("products ");
		sql.append("SET ");
		sql.append("    id_catogory = ");
		sql.append("'"+productAd.getId_catogory()+"', ");
		sql.append("    sizes = ");
		sql.append("'"+productAd.getSizes()+"', ");
		sql.append("    name = ");
		sql.append("'"+productAd.getName()+"', ");
		sql.append("    price = ");
		sql.append("'"+productAd.getPrice()+"', ");
		sql.append("    sale = ");
		sql.append("'"+productAd.getSale()+"', ");
		sql.append("    title = ");
		sql.append("'"+productAd.getTitle()+"', ");
		sql.append("    highlight = ");
		sql.append("'"+productAd.getHighlight()+"', ");
		sql.append("    new_product = ");
		sql.append("'"+productAd.getNew_product()+"', ");
		sql.append("    details = ");
		sql.append("'"+productAd.getDetails()+"' ");
		sql.append("WHERE id = ");
		sql.append("'"+productAd.getId_product()+"'");
		int edit = _jdbcTemplate.update(sql.toString());
		return edit;
	}
	public int DeleteProductAd(ProductForAdmin productAd) {
		StringBuffer  sql = new StringBuffer();
		sql.append("DELETE ");
		sql.append("FROM products ");
		sql.append("WHERE id = ");
		sql.append("'"+productAd.getId_product()+"'");
		int delete = _jdbcTemplate.update(sql.toString());
		return delete;
	} 
	
}
