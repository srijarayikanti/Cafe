package cafe_Management.demo.controller;

import cafe_Management.demo.enitites.Customer;
import cafe_Management.demo.enitites.Order;
import cafe_Management.demo.model.CreateOrderRequest;
import cafe_Management.demo.model.RequestOrdersDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface ordersController {

    @Operation(
            summary="Fetch all orders",
            operationId="fetchAllOrders",
            tags="Orders",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/customer/fetchAllOrders",
            produces = "application/json"
    )
    @CrossOrigin
    ResponseEntity<List<RequestOrdersDto>> fetchAllOrders();

    @Operation(
            summary="saveOrderDetails",
            operationId="saveOrderDetails",
            tags="Orders",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/customer/saveOrderDetails",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> saveOrderDetails(@RequestBody RequestOrdersDto request);

    @Operation(
            summary="saveOrderDetails",
            operationId="saveOrderDetails",
            tags="Orders",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/customer/createOrderDetails",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    Order createOrderDetails(CreateOrderRequest request);

    @Operation(
            summary="saveOrderDetails",
            operationId="saveOrderDetails",
            tags="Orders",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/customer/cancelOrder",
            produces = "application/json",
            consumes = "application/json"
    )
    @CrossOrigin
    ResponseEntity<?> cancelOrder(Long orderId);

    @Operation(
            summary="getOrderById",
            operationId="getOrderById",
            tags="Orders",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = Order.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/customer/getOrderById",
            produces = "application/json"
    )
    @CrossOrigin
    Order getOrderById(Long orderId);
}
