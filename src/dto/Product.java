package dto;

import java.io.Serializable;


/*
 * 상품아이디,상품명,상품가격,상품설명,제조사,분류,재고수,상품상태 속성을 설정하고 Set,Get통해 값을 넘겨주고 받을수있다
 * 또한 ProductRepository 클래스에 상품속성 값을 추가하는 메소드를 제공한다.
 */
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productId; //상품아이디
	private String pname;//상품명
	private Integer unitPrice; //상품가격
	private String description; //상품설명
	private String manufacurer; //제조사
	private String category;//분류
	private long unitInStock; //재고 수
	private String condition;//상품 상태
	
	public Product() {
		super();
	}

	public Product(String productId,String pname,Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
		
	}
	
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacurer() {
		return manufacurer;
	}

	public void setManufacurer(String manufacurer) {
		this.manufacurer = manufacurer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(long unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}


	
}

