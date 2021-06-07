package ClothesShop.Dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;


import ClothesShop.Dto.ProductsDto;
import ClothesShop.Dto.ProductsDtoMapper;


@Repository
public class CompairDao extends BaseDao{
	
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
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.image ");
		sql.append("FROM ");
		sql.append("products AS p ");
		sql.append("INNER JOIN ");
		sql.append("colors AS c ");
		sql.append("ON p.id = c.id_product ");
		return sql;
	}
	private StringBuffer SqlProductByID(long id_product) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND p.id = "+id_product + " ");
		sql.append("LIMIT 1 ");
		return sql;
	}
	public ProductsDto FindProductByID(long id_product) {
		String sql = SqlProductByID(id_product).toString();
		ProductsDto product = _jdbcTemplate.queryForObject(sql, new ProductsDtoMapper());
		return product;
	}
	
	
	public HashMap<Long, ProductsDto> Add1(long id, HashMap<Long, ProductsDto> sp) {
		ProductsDto itemCompair = new ProductsDto();
		ProductsDto product = FindProductByID(id);
		itemCompair.setProduct(product);
		sp.put(id, itemCompair);
		return sp;
	}
	public  HashMap<Long, ProductsDto> Delete1(long id, HashMap<Long, ProductsDto> sp) {
		if (sp == null) {
			return sp;
		}
		if (sp.containsKey(id)) {
			sp.remove(id);
		}
		return sp;
	}
}
