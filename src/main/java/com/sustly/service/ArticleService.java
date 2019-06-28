package com.sustly.service;

import com.sustly.entry.Blog;

import java.util.List;

/**
 * ArticleService
 * @author admin
 */
public interface ArticleService {
    /**
     * save
     * @param blog blog
     */
    void save(Blog blog);

    /**
     * findById
     * @param id id
     * @return Blog
     */
    Blog findById(Integer id);

    /**
     * delete
     * @param id id
     */
    void delete(Integer id);

    /**
     * getAllCount
     * @return long
     */
    long getAllCount();

    /**
     * 分页查询
     * @param page page
     * @return List<Blog>
     */
    List<Blog> getBlogListByPage(Integer page);

    /**
     * 分页查询
     * @param page page
     * @return List<Blog>
     */
    List<Blog> getBlogListByView(Integer page);

    long getAllCountByCategory(String category);

    List<Blog> getBlogListByCategory(Integer page, String category);
}