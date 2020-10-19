package pe.edu.upc.restaurantservice.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.restaurantservice.Entity.Owner;
import pe.edu.upc.restaurantservice.Service.OwnerService;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerService ownerService;
    @Override
    public Owner save(Owner entity) throws Exception {
        return ownerService.save(entity);
    }

    @Override
    public List<Owner> findAll() throws Exception {
        return ownerService.findAll();
    }

    @Override
    public Optional<Owner> findById(Long aLong) throws Exception {
        return ownerService.findById(aLong);
    }

    @Override
    public Owner update(Owner entity) throws Exception {
        return ownerService.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        ownerService.deleteById(aLong);
    }
}
