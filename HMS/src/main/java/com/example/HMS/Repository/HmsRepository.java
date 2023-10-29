/**
 * 
 */
package com.example.HMS.Repository;
import java.util.List;

// importing Crud Repository class
import org.springframework.data.repository.CrudRepository;
// importing house model class from different package
import com.example.HMS.Models.House;

/**
 * @author karth
 *
 */

// To connect for the database
public interface HmsRepository extends CrudRepository<House, Integer>{

	
}
