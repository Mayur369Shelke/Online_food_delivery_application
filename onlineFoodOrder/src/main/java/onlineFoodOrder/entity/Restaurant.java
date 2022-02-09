package onlineFoodOrder.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restaurantId;
	
	private String restaurantName;
	
	private String restaurantAddress;
	
	private String restaurantCity;
	
	private String restaurantState;
	
	private String restaurantcountry;
	
	private int restaurantPincode;
	
	private String restaurantManagerFirstName;
	
	private String restaurantManagerLastName;
	
	private int restaurantManagerNumber;
	
	private String restaurantManagerEmail;
	
	@OneToMany(cascade = CascadeType.ALL )
	@JoinColumn(name = "item_Id")
	private List<Items> items;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String restaurantName, String restaurantAddress, String restaurantCity, String restaurantState,
			String restaurantcountry, int restaurantPincode, String restaurantManagerFirstName,
			String restaurantManagerLastName, int restaurantManagerNumber, String restaurantManagerEmail) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantCity = restaurantCity;
		this.restaurantState = restaurantState;
		this.restaurantcountry = restaurantcountry;
		this.restaurantPincode = restaurantPincode;
		this.restaurantManagerFirstName = restaurantManagerFirstName;
		this.restaurantManagerLastName = restaurantManagerLastName;
		this.restaurantManagerNumber = restaurantManagerNumber;
		this.restaurantManagerEmail = restaurantManagerEmail;
	}

	public Restaurant(String restaurantName, String restaurantAddress, String restaurantCity, String restaurantState,
			String restaurantcountry, int restaurantPincode, String restaurantManagerFirstName,
			String restaurantManagerLastName, int restaurantManagerNumber, String restaurantManagerEmail,
			List<Items> items) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantCity = restaurantCity;
		this.restaurantState = restaurantState;
		this.restaurantcountry = restaurantcountry;
		this.restaurantPincode = restaurantPincode;
		this.restaurantManagerFirstName = restaurantManagerFirstName;
		this.restaurantManagerLastName = restaurantManagerLastName;
		this.restaurantManagerNumber = restaurantManagerNumber;
		this.restaurantManagerEmail = restaurantManagerEmail;
		this.items = items;
	}

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public String getRestaurantCity() {
		return restaurantCity;
	}

	public void setRestaurantCity(String restaurantCity) {
		this.restaurantCity = restaurantCity;
	}

	public String getRestaurantState() {
		return restaurantState;
	}

	public void setRestaurantState(String restaurantState) {
		this.restaurantState = restaurantState;
	}

	public String getRestaurantcountry() {
		return restaurantcountry;
	}

	public void setRestaurantcountry(String restaurantcountry) {
		this.restaurantcountry = restaurantcountry;
	}

	public int getRestaurantPincode() {
		return restaurantPincode;
	}

	public void setRestaurantPincode(int restaurantPincode) {
		this.restaurantPincode = restaurantPincode;
	}

	public String getRestaurantManagerFirstName() {
		return restaurantManagerFirstName;
	}

	public void setRestaurantManagerFirstName(String restaurantManagerFirstName) {
		this.restaurantManagerFirstName = restaurantManagerFirstName;
	}

	public String getRestaurantManagerLastName() {
		return restaurantManagerLastName;
	}

	public void setRestaurantManagerLastName(String restaurantManagerLastName) {
		this.restaurantManagerLastName = restaurantManagerLastName;
	}

	public int getRestaurantManagerNumber() {
		return restaurantManagerNumber;
	}

	public void setRestaurantManagerNumber(int restaurantManagerNumber) {
		this.restaurantManagerNumber = restaurantManagerNumber;
	}

	public String getRestaurantManagerEmail() {
		return restaurantManagerEmail;
	}

	public void setRestaurantManagerEmail(String restaurantManagerEmail) {
		this.restaurantManagerEmail = restaurantManagerEmail;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	

}
