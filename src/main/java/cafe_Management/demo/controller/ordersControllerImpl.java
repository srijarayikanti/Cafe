package cafe_Management.demo.controller;

import cafe_Management.demo.Service.ordersService;
import cafe_Management.demo.enitites.Order;
import cafe_Management.demo.model.CreateOrderRequest;
import cafe_Management.demo.model.RequestOrdersDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ordersControllerImpl implements ordersController {
    private final ordersService ordersService;

    public ordersControllerImpl(ordersService ordersService) {
        this.ordersService = ordersService;
    }

    @Override
    public ResponseEntity<List<RequestOrdersDto>> fetchAllOrders() {
        try {
            return ordersService.fetchAllOrders();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public ResponseEntity<?> saveOrderDetails(RequestOrdersDto request) {
     return ordersService.saveOrderDetails(request);
    }

    @Override
    public ResponseEntity<Order> createOrderDetails(CreateOrderRequest request){
        return ordersService.createOrder(request);
    }

    @Override
    public ResponseEntity<?> cancelOrder(Long orderId){
        return ordersService.cancelOrder(orderId);
    }

    @Override
    public Order getOrderById(Long orderId){
        return ordersService.getOrderById(orderId);
    }
}
