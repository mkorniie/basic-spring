package ua.mkorniie.springboot.service;

import org.springframework.stereotype.Service;
import ua.mkorniie.springboot.model.ItemOfClosing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkorniie on 5/25/19.
 */
@Service
public class ItemsOfClosingService {
    private static List<ItemOfClosing> items = new ArrayList<>();

    public List<ItemOfClosing> findAll() {
        return null;
    }
}
