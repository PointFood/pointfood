package pe.edu.upc.orderservice.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.orderservice.Entity.Order;
import pe.edu.upc.orderservice.Repository.OrderRepository;
import pe.edu.upc.orderservice.Service.OrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Order save(Order entity) throws Exception {
        return orderRepository.save(entity);
    }

    @Override
    public List<Order> findAll() throws Exception {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(Long aLong) throws Exception {
        return orderRepository.findById(aLong);
    }

    @Override
    public Order update(Order entity) throws Exception {
        return orderRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        orderRepository.deleteById(aLong);
    }
}
