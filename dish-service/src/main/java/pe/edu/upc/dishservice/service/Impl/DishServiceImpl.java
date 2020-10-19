package pe.edu.upc.dishservice.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.dishservice.entity.Dish;
import pe.edu.upc.dishservice.repository.DishRepository;
import pe.edu.upc.dishservice.service.DishService;

import java.util.List;
import java.util.Optional;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private DishRepository dishRepository;

    @Override
    public Dish save(Dish entity) throws Exception {
        return dishRepository.save(entity);
    }

    @Override
    public List<Dish> findAll() throws Exception {
        return dishRepository.findAll();
    }

    @Override
    public Optional<Dish> findById(Long aLong) throws Exception {
        return dishRepository.findById(aLong);
    }

    @Override
    public Dish update(Dish entity) throws Exception {
        return dishRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        dishRepository.deleteById(aLong);
    }
}
