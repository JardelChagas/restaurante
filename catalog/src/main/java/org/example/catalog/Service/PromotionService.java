package org.example.catalog.Service;

import org.example.catalog.model.Promotion;
import org.example.catalog.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {
    @Autowired
    PromotionRepository promotionRepository;
    public List<Promotion> findAll(){
        return promotionRepository.findAll();
    }
    public Promotion findById(Long id){
        return promotionRepository.findById(id).get();
    }
    public Promotion save(Promotion promotion){
        return promotionRepository.save(promotion);
    }
    public Promotion update(Promotion promotion){
        return promotionRepository.save(promotion);
    }
}
