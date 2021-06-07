package ClothesShop.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.MapperUsers;
import ClothesShop.Entity.Users;
@Repository
public class Users_Admin_Dao extends BaseDao {
	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("    id, ");
		sql.append("    user, ");
		sql.append("    password, ");
		sql.append("    display_name, ");
		sql.append("    address, ");
		sql.append("    role ");
		sql.append("FROM users ");
		return sql;
	}
	private StringBuffer SqlAllAccount() {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		return sql;
	}
	public List<Users> GetAllAccount() {
		String sql = SqlAllAccount().toString();
		List<Users> listUsers = _jdbcTemplate.query(sql, new MapperUsers());
		return listUsers;
	}
	private StringBuffer SqlAccountByID(long id) {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id = "+id + " ");
		sql.append("LIMIT 1 ");
		return sql;
	}
	public Users FindAccountByID(long id) {
		String sql = SqlAccountByID(id).toString();
		Users user = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return user;
	}
	public int AddAccountAd(Users user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO users ");
		sql.append("( ");
		sql.append("    user, ");
		sql.append("    password, ");
		sql.append("    display_name, ");
		sql.append("    address ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+user.getUser()+"', ");
		sql.append("    '"+user.getPassword()+"', ");
		sql.append("    '"+user.getDisplay_name()+"', ");
		sql.append("    '"+user.getAddress()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	public int EditAccountAd(Users user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE ");
		sql.append("users ");
		sql.append("SET ");
		sql.append("    user = ");
		sql.append("'"+user.getUser()+"', ");
		sql.append("    password = ");
		sql.append("'"+user.getPassword()+"', ");
		sql.append("    display_name = ");
		sql.append("'"+user.getDisplay_name()+"', ");
		sql.append("    address = ");
		sql.append("'"+user.getAddress()+"' ");
		sql.append("WHERE id = ");
		sql.append("'"+user.getId()+"'");
		int edit = _jdbcTemplate.update(sql.toString());
		return edit;
	}
	public int DeleteAccountAd(Users user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("DELETE ");
		sql.append("FROM users ");
		sql.append("WHERE id = ");
		sql.append("'"+user.getId()+"'");
		int delete = _jdbcTemplate.update(sql.toString());
		return delete;
	} 
}
