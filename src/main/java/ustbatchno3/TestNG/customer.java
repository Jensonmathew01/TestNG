package ustbatchno3.TestNG;

public class customer {
	private String city;
	private int price_with_material;
	private int price_without_material;
	private int customer_id;
	private String customer_name;
	private int squareft;
	public customer(String city, int price_with_material, int price_without_material, int customer_id,
			String customer_name, int squareft) {
		super();
		this.city = city;
		this.price_with_material = price_with_material;
		this.price_without_material = price_without_material;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.squareft = squareft;

	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice_with_material() {
		return price_with_material;
	}
	public void setPrice_with_material(int price_with_material) {
		this.price_with_material = price_with_material;
	}
	public int getPrice_without_material() {
		return price_without_material;
	}
	public void setPrice_without_material(int price_without_material) {
		this.price_without_material = price_without_material;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getSquareft() {
		return squareft;
	}
	public void setSquareft(int squareft) {
		this.squareft = squareft;
	}
	@Override
	public String toString() {
		return "customer [city=" + city + ", price_with_material=" + price_with_material + ", price_without_material="
				+ price_without_material + ", customer_id=" + customer_id + ", customer_name=" + customer_name
				+ ", squareft=" + squareft + "]";
	}
	

	
	

}
