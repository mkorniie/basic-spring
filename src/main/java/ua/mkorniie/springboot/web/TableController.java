package ua.mkorniie.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.mkorniie.springboot.model.ItemOfClosing;
import ua.mkorniie.springboot.service.ItemsOfClosingService;

import java.util.List;

/**
 * Created by mkorniie on 5/25/19.
 */

@RestController
@RequestMapping("/api/itemofclosing")
public class TableController {
    @Autowired
    private ItemsOfClosingService itemsofclosingService;

    @RequestMapping
    public List<ItemOfClosing> getListOfItems() {
        return itemsofclosingService.findAll();
    }
}
