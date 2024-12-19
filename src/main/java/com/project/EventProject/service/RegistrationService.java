package com.project.EventProject.service;

import java.util.List;

import com.project.EventProject.model.Registration;

public interface RegistrationService {
	Registration insertrecord(Registration r);
	List<Registration> getAll();
	void del(int ri);
	Registration updaterecord(Registration r);
	List<Registration> login(String emailid,String password);

}
