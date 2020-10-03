package pe.edu.upc.cardservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.cardservice.entity.Card;
import pe.edu.upc.cardservice.repository.CardRepository;
import pe.edu.upc.cardservice.service.CardService;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card save(Card entity) throws Exception {
        return cardRepository.save(entity);
    }

    @Override
    public List<Card> findAll() throws Exception {
        return cardRepository.findAll();
    }

    @Override
    public Optional<Card> findById(Long aLong) throws Exception {
        return cardRepository.findById(aLong);
    }

    @Override
    public Card update(Card entity) throws Exception {
        return cardRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        cardRepository.deleteById(aLong);
    }
}
