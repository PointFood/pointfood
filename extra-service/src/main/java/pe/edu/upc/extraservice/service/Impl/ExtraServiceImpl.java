package pe.edu.upc.extraservice.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.extraservice.entity.Extra;
import pe.edu.upc.extraservice.repository.ExtraRepository;
import pe.edu.upc.extraservice.service.ExtraService;

import java.util.List;
import java.util.Optional;

@Service
public class ExtraServiceImpl implements ExtraService {
    @Autowired
    private ExtraRepository extraRepository;
    @Override
    public Extra save(Extra entity) throws Exception {
        return extraRepository.save(entity);
    }

    @Override
    public List<Extra> findAll() throws Exception {
        return extraRepository.findAll();
    }

    @Override
    public Optional<Extra> findById(Long aLong) throws Exception {
        return extraRepository.findById(aLong);
    }

    @Override
    public Extra update(Extra entity) throws Exception {
        return extraRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        extraRepository.deleteById(aLong);
    }
}
