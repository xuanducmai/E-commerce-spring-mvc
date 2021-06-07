package ClothesShop.Entity;


public class ProductForAdmin {

	private    long id_product;
	private   int  id_catogory;
	private    String sizes;
	private   String  name;
	private   double  price;
	private    int sale;
	private   String  title;
	private    int highlight;
	private   int new_product;
	private    String details;

	public ProductForAdmin() {
		super();
	}

	public long getId_product() {
		return id_product;
	}

	public void setId_product(long id_product) {
		this.id_product = id_product;
	}

	public int getId_catogory() {
		return id_catogory;
	}

	public void setId_catogory(int id_catogory) {
		this.id_catogory = id_catogory;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHighlight() {
		return highlight;
	}

	public void setHighlight(int highlight) {
		this.highlight = highlight;
	}

	public int getNew_product() {
		return new_product;
	}

	public void setNew_product(int new_product) {
		this.new_product = new_product;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}