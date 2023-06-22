package com.doranco.services;

import com.doranco.entity.Adresse;
import com.doranco.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService {

    private final AdresseRepository adresseRepository;

    @Autowired
    public AdresseService(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public List<Adresse> getAllAdresses() {
        return adresseRepository.findAll();
    }

    public Adresse getAdresseById(Long id) {
        return adresseRepository.findById(id).orElse(null);
    }

    public Adresse createAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    public Adresse updateAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    public void deleteAdresse(Long id) {
        adresseRepository.deleteById(id);
    }
}
