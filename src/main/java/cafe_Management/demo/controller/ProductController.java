package cafe_Management.demo.controller;

import cafe_Management.demo.Service.ProductService;
import cafe_Management.demo.enitites.Order;
import cafe_Management.demo.enitites.Product;
import cafe_Management.demo.model.RequestProductDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {

    @Operation(
    summary="saveProductDetails",
    operationId="saveProductDetails",
    tags="Product",
    responses = {
        @ApiResponse(responseCode = "200",description = "saveProductDetails saved successfully",content=@Content(mediaType ="application/json",
                schema = @Schema(implementation = Product.class))),
        @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                schema = @Schema(implementation = Product.class)))
    }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "Product/saveProductDetails",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> saveProductDetails(@RequestBody List<RequestProductDto> request);

    @Operation(
            summary = "updateProductDetails",
            operationId = "updateProductDetails",
            tags = "Product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Product details updated successfully", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class))),
                    @ApiResponse(responseCode = "404", description = "Product not found", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)))
            }
    )
    @RequestMapping(
            method = RequestMethod.PUT,
            value = "Product/updateProductDetails/{productId}",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> updateProductDetails(@RequestParam Integer productId,@RequestBody RequestProductDto request);

    @Operation(
            summary = "deleteProductDetails",
            operationId = "deleteProductDetails",
            tags = "Product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Product details deleted successfully", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class))),
                    @ApiResponse(responseCode = "404", description = "Product not found", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)))
            }
    )
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "Product/deleteProductDetails/{productId}",
            produces = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> deleteProductDetails(@RequestParam Integer productId);


    @Operation(
            summary = "getProductByProductId",
            operationId = "getProductByProductId",
            tags = "Product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Product details fetched successfully", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class))),
                    @ApiResponse(responseCode = "404", description = "Product not found", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)))
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "Product/getProductByProductId/{productId}",
            produces = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> getProductByProductId(@RequestParam Integer productId);

    @Operation(
            summary = "getAllProducts",
            operationId = "getAllProducts",
            tags = "Product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "All product details fetched successfully", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class))),
                    @ApiResponse(responseCode = "404", description = "No products found", content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)))
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "Product/getAllProducts",
            produces = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> getAllProducts();
}
