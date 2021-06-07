package ClothesShop.Dto;


public class ProductsDto {

	private    long id_product;
	private   int  id_catogory;
	private    String sizes;
	private   String  name;
	private   double  price;
	private    int sale;
	private   String  title;
	private    boolean highlight;
	private   boolean  new_product;
	private    String details;
	private    long id_color;
	private   String  name_color;
	private   String  code_color;
	private   String  image;
	private ProductsDto product;
	public ProductsDto() {
		super();
	}
	public ProductsDto getProduct() {
		return product;
	}
	public void setProduct(ProductsDto product) {
		this.product = product;
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
	public boolean isHighlight() {
		return highlight;
	}
	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}
	public boolean isNew_product() {
		return new_product;
	}
	public void setNew_product(boolean new_product) {
		this.new_product = new_product;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public long getId_color() {
		return id_color;
	}
	public void setId_color(long id_color) {
		this.id_color = id_color;
	}
	public String getName_color() {
		return name_color;
	}
	public void setName_color(String name_color) {
		this.name_color = name_color;
	}
	public String getCode_color() {
		return code_color;
	}
	public void setCode_color(String code_color) {
		this.code_color = code_color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
}
