//저장소 작업 완료 
package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository{
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
    private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance(){
		return instance;
    }


    public ProductRepository(){

        Product original_pepero = new Product("P1242", "메카 티리엘 세트", 1000); // 생성자를 통해 상품 객체 생성
    	original_pepero.setDescription("메카 티리엘 스킨 3종 + 티리엘의 군마 탈것 "); // 상품 설명
    	original_pepero.setCategory("Skin"); // 상품 분류
        original_pepero.setManufacturer("블리자드"); // 제조사
        original_pepero.setUnitsInStock(1000); // 재고수
        original_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	original_pepero.setFilename("P1242.jpg?v=1"); // 가져올 파일 이름
        
        Product amond_pepero = new Product("P1243", "메카 레가르", 900); // 생성자를 통해 상품 객체 생성
    	amond_pepero.setDescription("메카 레가르 스킨 3종"); // 상품 설명
    	amond_pepero.setCategory("Skin"); // 상품 분류
        amond_pepero.setManufacturer("블리자드"); // 제조사
        amond_pepero.setUnitsInStock(1000); // 재고수
        amond_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	amond_pepero.setFilename("P1243.jpg?v=1"); // 가져올 파일 이름

        Product nude_pepero = new Product("P1244", "메카 아바투르", 900); // 생성자를 통해 상품 객체 생성
    	nude_pepero.setDescription("메카 아바투르 스킨 3종"); // 상품 설명
    	nude_pepero.setCategory("Skin"); // 상품 분류
        nude_pepero.setManufacturer("블리자드"); // 제조사
        nude_pepero.setUnitsInStock(1000); // 재고수
        nude_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	nude_pepero.setFilename("P1244.jpg?v=1"); // 가져올 파일 이름
        
        Product jeju_pepero = new Product("P1245", "할로윈 화이트메인 세트 ", 1200); // 생성자를 통해 상품 객체 생성
    	jeju_pepero.setDescription("할로윈 화이트메인 스킨 3종"); // 상품 설명
    	jeju_pepero.setCategory("Skin"); // 상품 분류
        jeju_pepero.setManufacturer("블리자드"); // 제조사
        jeju_pepero.setUnitsInStock(1000); // 재고수
        jeju_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	jeju_pepero.setFilename("P1245.jpg?v=1"); // 가져올 파일 이름
        
        Product cookie_pepero = new Product("P1246", "청소왕 레오릭 세트", 1600); // 생성자를 통해 상품 객체 생성
    	cookie_pepero.setDescription("청소왕 레오릭 스킨 3종"); // 상품 설명
    	cookie_pepero.setCategory("Skin"); // 상품 분류
        cookie_pepero.setManufacturer("블리자드"); // 제조사
        cookie_pepero.setUnitsInStock(1000); // 재고수
        cookie_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	cookie_pepero.setFilename("P1246.jpg?v=1"); // 가져올 파일 이름
        

    	Product crunky_pepero = new Product("P1247", "천사 디아블로 세트", 1000); // 생성자를 통해 상품 객체 생성
    	crunky_pepero.setDescription("디아블로 스킨 3종"); // 상품 설명
    	crunky_pepero.setCategory("Skin"); // 상품 분류
        crunky_pepero.setManufacturer("블리자드"); // 제조사
        crunky_pepero.setUnitsInStock(1000); // 재고수
          crunky_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	crunky_pepero.setFilename("P1247.jpg?v=1"); // 가져올 파일 이름
        
        Product melon_pepero = new Product("P1248", "칼데움 카라짐 세트", 1900); // 생성자를 통해 상품 객체 생성
    	melon_pepero.setDescription("칼데움 카라짐 스킨 3종"); // 상품 설명
    	melon_pepero.setCategory("Skin"); // 상품 분류
        melon_pepero.setManufacturer("블리자드"); // 제조사
        melon_pepero.setUnitsInStock(320); // 재고수
        melon_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	melon_pepero.setFilename("P1248.jpg?v=1"); // 가져올 파일 이름
        
       	Product chocolate_cookie_pepero = new Product("P1249", "대여사제 마이에브 세트", 1600); // 생성자를 통해 상품 객체 생성
    	chocolate_cookie_pepero.setDescription("대여사제 마이에브 스킨 3종"); // 상품 설명
    	chocolate_cookie_pepero.setCategory("Skin"); // 상품 분류
        chocolate_cookie_pepero.setManufacturer("블리자드"); // 제조사
        chocolate_cookie_pepero.setUnitsInStock(170); // 재고수
        chocolate_cookie_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	chocolate_cookie_pepero.setFilename("P1249.jpg?v=1"); // 가져올 파일 이름

        Product strawberry_pepero = new Product("P1250", "파괴자 디바 세트", 2000); // 생성자를 통해 상품 객체 생성
    	strawberry_pepero.setDescription("파괴자 디바 스킨 3종"); // 상품 설명
    	strawberry_pepero.setCategory("Skin"); // 상품 분류
        strawberry_pepero.setManufacturer("블리자드"); // 제조사
        strawberry_pepero.setUnitsInStock(40); // 재고수
        strawberry_pepero.setCondition("New"); // 신상품, 중고품, 재생품
    	strawberry_pepero.setFilename("P1250.jpg?v=1"); // 가져올 파일 이름
        
		listOfProducts.add(original_pepero);
		listOfProducts.add(amond_pepero);
		listOfProducts.add(nude_pepero);
        listOfProducts.add(jeju_pepero);
        listOfProducts.add(cookie_pepero);
        listOfProducts.add(crunky_pepero);
        listOfProducts.add(melon_pepero);
        listOfProducts.add(chocolate_cookie_pepero);
        listOfProducts.add(strawberry_pepero);
		// listOfProducts.add(상품명);

    }    
    
    
    
    
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
    
    public void addProduct(Product product) {
		listOfProducts.add(product);
   }

}