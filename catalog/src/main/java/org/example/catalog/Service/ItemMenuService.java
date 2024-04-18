package org.example.catalog.Service;

import org.example.catalog.model.ItemMenu;
import org.example.catalog.repository.ItemMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemMenuService {
    @Autowired
    private ItemMenuRepository itemMenuRepository;

    public List<ItemMenu> findAll(){
       return itemMenuRepository.findAll();
    }
    public ItemMenu save(ItemMenu itemMenu){
        return itemMenuRepository.save(itemMenu);
    }
    public ItemMenu findById(Long id){
        return itemMenuRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id){
        itemMenuRepository.deleteById(id);
    }
}
