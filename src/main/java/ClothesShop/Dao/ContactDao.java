package ClothesShop.Dao;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.Contact;
@Repository
public class ContactDao extends BaseDao {
	
	public int AddContact(Contact contact) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO contact ");
		sql.append("( ");
		sql.append("    name_user, ");
		sql.append("    email, ");
		sql.append("    subject, ");
		sql.append("    content ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+contact.getName_user()+"', ");
		sql.append("    '"+contact.getEmail()+"', ");
		sql.append("    '"+contact.getSubject()+"', ");
		sql.append("    '"+contact.getContent()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
}
