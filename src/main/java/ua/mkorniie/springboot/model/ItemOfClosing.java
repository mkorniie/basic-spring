package ua.mkorniie.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by mkorniie on 5/25/19.
 */
@Getter
@AllArgsConstructor
public class ItemOfClosing {
    private final String iconImageUrl;
    private final int id;
    private final String website;
    private final String title;
    private final String description;
}
