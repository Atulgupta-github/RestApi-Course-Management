package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	
	
	
	//List<Course> list;
	
	public CourseServiceImpl() {
		/*
		 * list = new ArrayList<>(); list.add(new Course(145,"java core",
		 * "Basic java")); list.add(new Course(146,"spring boot course",
		 * "Rest api using spring boot")); list.add(new Course(147,"react",
		 * "Rest api using react js"));
		 */
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getcourse(long courseId) {
		/*
		 * Course c =null; for(Course course: list) { if(courseId==course.getId()) {
		 * c=course; break; }
		 * 
		 * }
		 */
		 Course entity =courseDao.getOne(courseId);
		return entity;
	}

	@Override
	public Course addCourse(Course course) {
		
		//list.add(course);
		
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		/*
		 * for(Course cou :list) { if(course.getId()==cou.getId()) {
		 * cou.setDescription(course.getDescription()); cou.setTitle(course.getTitle());
		 * } } return course;
		 */
		
		/*
		 * list.forEach(e ->{ if(e.getId()==course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		 * });
		 */
		courseDao.save(course);
		return course;
		
		
	}

	@Override
	public void deleteCourse(long parseLong) {
		//list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		
		Course entity= courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	
	/*	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"java core", "Basic java"));
		list.add(new Course(146,"spring boot course", "Rest api using spring boot"));
		list.add(new Course(147,"react", "Rest api using react js"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getcourse(long courseId) {
		Course c =null;
		for(Course course: list) {
			if(courseId==course.getId()) {
				c=course;
				break;
			}
			
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		  for(Course cou :list) { if(course.getId()==cou.getId()) {
		  cou.setDescription(course.getDescription()); cou.setTitle(course.getTitle());
		  } } return course;
		 
		
		list.forEach(e ->{
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		
		return course;
		
		
	}

	@Override
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		
	} */

}
