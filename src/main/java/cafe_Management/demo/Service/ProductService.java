package cafe_Management.demo.Service;

import cafe_Management.demo.model.RequestProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<?> saveProductDetails(List<RequestProductDto> request);

    ResponseEntity<?> updateProductDetails(Integer productId, RequestProductDto request);

    ResponseEntity<?> deleteProductDetails(Integer productId);

    ResponseEntity<?> getProductByProductId(Integer productId);

    ResponseEntity<?> getAllProducts();
}
