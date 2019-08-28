package mapper.order;

import java.util.List;
import java.util.Map;

import entity.order.OrderEntity;

public interface OrderMapper {
	public List<OrderEntity> selectqt(String name);
	public void insert(OrderEntity order);
	public void update(OrderEntity order);
	public void delete(Integer id);
	public Integer selectcount(Map<String,Object> mapa);
	public List<OrderEntity> list(Map<String,Object> map);
	public OrderEntity get(Integer id);
	public void OrderStatus(Map<String,Object> map);
	public void receiptStatus(Integer id);
	public List<OrderEntity> ras();
}
