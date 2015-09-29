/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.repository;

import org.springframework.data.repository.CrudRepository;
import ozone.domain.Category;

/**
 *
 * @author DAMONSLU
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}

