package com.yakupatmaca.cwms.service;

import com.yakupatmaca.cwms.model.Color;

import java.util.List;
import java.util.Optional;

public interface ColorService {
    List<Color> findAll();
    Optional<Color> findById(int id);
    Color save(Color color);
    void deleteById(int id);
}

