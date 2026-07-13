package com.axsos.burgertracker.services;

import org.springframework.stereotype.Service;
import com.axsos.burgertracker.models.Burger;
import java.util.List;
import java.util.Optional;

import com.axsos.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;


	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}

	public List<Burger> allBurgers(){
		return burgerRepository.findAll();
	}

    public Burger saveBurger(Burger burger) {
        return burgerRepository.save(burger);
    }


    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);

        if (optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }

}
