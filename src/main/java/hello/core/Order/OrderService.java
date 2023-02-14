package hello.core.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int Price); // 누가 주문했는지
}
