package com.sustly.dao;

import com.sustly.entry.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;

/**
 * @author admin
 */
public interface ArticleDao extends JpaRepository<Blog, Integer>, JpaSpecificationExecutor<Blog> {
    /**
     * findById
     * @param id id
     * @return Blog
     */
    Blog getBlogById(Integer id);

    /**
     * countByCategory
     * @param category category
     * @return long
     */
    long countByCategory(String category);

    /**
     * deleteById
     * @param id id
     */
    @Modifying
    void deleteById(Integer id);
}
