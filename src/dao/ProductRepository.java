package dao;

import java.util.ArrayList;

import dto.Product;;

public class ProductRepository {
	/*
	 * Product 클래스에서 설정해준 각 속성에 대하여 값을 넣어준다 ArrayList를 활용하여
	 * 객체를 생성해서 각 상품(phone,notebook,tablet)를 추가해주고 
	 * 이 추가한 상품목록을 활용할수있게 해준다
	 */
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	
	public ProductRepository() {
		
		Product phone = new Product("P11234","iPhone 12 ",1000000);
		phone.setDescription("6.1-inch,2532X1170 Super Retina XDR display , 듀얼 12MP 카메라");
		phone.setCategory("Smart Phone");
		phone.setManufacurer("Apple");
		phone.setUnitInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235"," LG PC 그램" ,1500000);
		notebook.setDescription("13.3-inch,IPS LED display , 5rd Generation Inel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacurer("LG");
		notebook.setUnitInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236","Galaxy Tab S ",900000);
		tablet.setDescription("212.8*125.6*6.6mm,Super AMOLED display, Octa-Cpre processor");
		tablet.setCategory("Tablet");
		tablet.setManufacurer("Samsung");
		tablet.setUnitInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
		
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		for(int i=0;i<listOfProducts.size();i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}

}
