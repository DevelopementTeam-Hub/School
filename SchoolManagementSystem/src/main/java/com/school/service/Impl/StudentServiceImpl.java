package com.school.service.Impl;

import org.springframework.stereotype.Service;

import com.school.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	/*	@Autowired
		private IStudentRepository repo;
		
		@Override
		public Integer saveStudent(Student s) {
			//After save(obj) same object is returned with  ID effected
	//		s=repo.save(s);
	//		return s.getStudentId();
		}
	
		@Override
		public List<Student> getAllStudents() {
			List<Student>list =  repo.findAll();
	//		Interface ob = (method params)->{method.body;} Comparator
	//		list.sort((s1,s2)->(s1.getStudentId()-s2.getStudentId()));
			
			
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					return s1.getStudentId()-s2.getStudentId();
					return s1.getStudentId().compareTo(s2.getStudentId());		comparator<=>comparableTo 
				}
				
			});
			return list;
		}*/
}
