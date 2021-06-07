package ClothesShop.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.BillDetail;
import ClothesShop.Entity.Bills;
import ClothesShop.Entity.MapperBillDetail;
import ClothesShop.Entity.MapperBills;


@Repository
public class Bills_Admin_Dao extends BaseDao{
	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("  id ");
		sql.append(", user ");
		sql.append(", phone ");
		sql.append(", display_name ");
		sql.append(", address ");
		sql.append(", total ");
		sql.append(", quanty ");
		sql.append(", note ");
		sql.append("FROM ");
		sql.append("bills ");
		return sql;
	}
	private StringBuffer SqlAllBill() {
		StringBuffer sql = SqlString();
		sql.append("WHERE 1 = 1 ");
		return sql;
	}
	public List<Bills> GetAllBill() {
		String sql = SqlAllBill().toString();
		List<Bills> listBill = _jdbcTemplate.query(sql, new MapperBills());
		return listBill;
	}
	
	
	private StringBuffer SqlStringDetail() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("  id ");
		sql.append(", id_product ");
		sql.append(", id_bills ");
		sql.append(", quanty ");
		sql.append(", total ");
		sql.append("FROM ");
		sql.append("billdetail ");
		return sql;
	}
	private StringBuffer SqlBillDetailByID(long id) {
		StringBuffer sql = SqlStringDetail();
		sql.append("WHERE 1 = 1 ");
		sql.append("AND id_bills = "+id + " ");
		return sql;
	}
	public List<BillDetail> GetBillDetailByID(long id) {
		String sql = SqlBillDetailByID(id).toString();
		List<BillDetail> listBillDetail = _jdbcTemplate.query(sql, new MapperBillDetail());
		return listBillDetail;
	}
}
