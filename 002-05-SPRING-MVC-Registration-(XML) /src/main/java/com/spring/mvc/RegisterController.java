package com.spring.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegisterController extends SimpleFormController {

	@Override
	public ModelAndView onSubmit(Object command) throws ServletException {
		Student stu = (Student) command;
		System.out.println(stu.getSid());
		System.out.println(stu.getSname());
		System.out.println(stu.getEmail());
		System.out.println(stu.getPhone());
		System.out.println(stu.getGender());
		System.out.println(stu.getQualification());
		String tim[] = stu.getTimings();
		for (String t : tim) {
			System.out.println(t);
		}
		System.out.println(stu.getRemarks());
		String view = getSuccessView();

		return new ModelAndView(view, "student", stu);
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws ServletException {
		Student stu = new Student();
		stu.setSid("STUDENT-003");
		return stu;
	}

}
