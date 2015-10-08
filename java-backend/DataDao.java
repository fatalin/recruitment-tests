package com.publishing.dao;

import java.util.Date; import java.util.List;

import com.publishing.model.Article;

public interface DataDao {

/**
 * Create an article (in DB)
 * 
 * @param article
 * @return success
 * @throws Exception
 */
public boolean addEntity(Article article) throws Exception;

/**
 * Update an article
 * 
 * @param article
 * @return success
 * @throws Exception
 */
public boolean updateEntity(Article article) throws Exception;

/**
 * Delete an article
 * 
 * @param id of the article (better have it as long already now, since we do
 *        not know how many articles we'll have in the future, so planning ahead)
 * @return success
 * @throws Exception
 */
public boolean deleteEntity(long id) throws Exception;

/**
 * Display one article (retrieving it from DB by id)
 * 
 * @param id of the article
 * @return article
 * @throws Exception
 */
public Article getEntityById(long id) throws Exception;

/**
 * List all articles
 * 
 * @return
 * @throws Exception
 */
public List<Article> getEntityList() throws Exception;

/**
 * List all articles for a given author
 * 
 * @param author
 * @return all articles for a given author
 * @throws Exception
 */
public List<Article> getEntityListByAuthor(String author) throws Exception;

/**
 * Find all articles for a specific keyword
 * 
 * @param keyword
 * @return all articles for a specific keyword
 * @throws Exception
 */
public List<Article> getEntityListByKeyword(String keyword) throws Exception;

/**
 * List all articles for a given period
 * 
 * @param fromDate
 * @param toDate
 * @return all articles for a given period
 * @throws Exception
 */
public List<Article> getEntityListByDateRange(Date fromDate, Date toDate) throws Exception;
}
