package pe.edu.upc.clientservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clientservice.entity.Client;
import pe.edu.upc.clientservice.repository.ClientRepository;
import pe.edu.upc.clientservice.service.ClientService;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client save(Client entity) throws Exception {
        return clientRepository.save(entity);
    }

    @Override
    public List<Client> findAll() throws Exception {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long aLong) throws Exception {
        return clientRepository.findById(aLong);
    }

    @Override
    public Client update(Client entity) throws Exception {
        return clientRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        clientRepository.deleteById(aLong);
    }
}
