package com.project.EventProject.service;

import java.util.List;

import com.project.EventProject.model.Feedback;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(Feedback r);
	
}
