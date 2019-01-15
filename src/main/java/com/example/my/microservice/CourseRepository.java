package com.example.my.microservice;
import org.springframework.data.repository.PagingAndSortingRepository;
/**
 * Created by uengine on 2018. 12. 19..
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> 
}
