package pe.edu.upc.restaurantservice.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.restaurantservice.Entity.Restaurant;
import pe.edu.upc.restaurantservice.Repository.RestaurantRepository;
import pe.edu.upc.restaurantservice.Service.RestaurantService;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public Restaurant save(Restaurant entity) throws Exception {
        return restaurantRepository.save(entity);
    }

    @Override
    public List<Restaurant> findAll() throws Exception {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> findById(Long aLong) throws Exception {
        return restaurantRepository.findById(aLong);
    }

    @Override
    public Restaurant update(Restaurant entity) throws Exception {
        return restaurantRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        restaurantRepository.deleteById(aLong);
    }
}
