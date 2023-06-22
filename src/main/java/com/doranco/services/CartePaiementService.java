package com.doranco.services;
import com.doranco.entity.CartePaiement;
import com.doranco.repository.CartePaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartePaiementService {

    private final CartePaiementRepository cartePaiementRepository;

    @Autowired
    public CartePaiementService(CartePaiementRepository cartePaiementRepository) {
        this.cartePaiementRepository = cartePaiementRepository;
    }

    public List<CartePaiement> getAllCartesPaiement() {
        return cartePaiementRepository.findAll();
    }

    public CartePaiement getCartePaiementById(Long id) {
        return cartePaiementRepository.findById(id).orElse(null);
    }

    public CartePaiement createCartePaiement(CartePaiement cartePaiement) {
        return cartePaiementRepository.save(cartePaiement);
    }

    public CartePaiement updateCartePaiement(CartePaiement cartePaiement) {
        return cartePaiementRepository.save(cartePaiement);
    }

    public void deleteCartePaiement(Long id) {
        cartePaiementRepository.deleteById(id);
    }
}
