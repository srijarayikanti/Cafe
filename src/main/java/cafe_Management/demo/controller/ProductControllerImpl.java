package cafe_Management.demo.controller;

import cafe_Management.demo.Service.ProductService;
import cafe_Management.demo.model.RequestProductDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {

    private final ProductService productService;

    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<?> saveProductDetails(List<RequestProductDto> request) {
        return productService.saveProductDetails(request);
    }

    @Override
    public ResponseEntity<?> updateProductDetails(Integer productId, RequestProductDto request) {
        return productService.updateProductDetails(productId, request);
    }

    @Override
    public ResponseEntity<?> deleteProductDetails(Integer productId) {
        return productService.deleteProductDetails(productId);
    }

    @Override
    public ResponseEntity<?> getProductByProductId(Integer productId){
        return productService.getProductByProductId(productId);
    }

    @Override
    public ResponseEntity<?> getAllProducts(){
        return productService.getAllProducts();
    }
}
