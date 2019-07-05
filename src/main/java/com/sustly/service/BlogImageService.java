package com.sustly.service;


import com.sustly.entry.Blog;

/**
 * @author admin
 */
public interface BlogImageService {

    /**
     * deleteAllByBlogId
     * @param blogId blogId
     */
    void deleteAllByBlogId(Integer blogId);

    /**
     * saveAllImage
     * @param blog blog
     */
    void saveAllImage(Blog blog);
}
