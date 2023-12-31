package org.example.dataAccess;

import org.example.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements ICategoryDao {
    List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category category) {
        System.out.println("Category added to database with JDBC" + category.getName());
        categories.add(category);
    }

    @Override
    public List<Category> getAll() {
        if (!categories.isEmpty()) {
            return categories;
        }
        return null;
    }

    @Override
    public void update(Category category) {
        for (Category category1 : categories) {
            if (category1.getId() == category.getId()) {
                category1.setName(category.getName());
                System.out.println("Updated in database with JDBC : " + category.getName());
                return;
            }
        }
        System.out.println("category not found with JDBC");
    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
        System.out.println("category is deleted in database with JDBC: ");
    }

    @Override
    public Category getById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
