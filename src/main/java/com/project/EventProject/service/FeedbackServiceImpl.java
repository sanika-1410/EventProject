package com.project.EventProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.EventProject.model.Feedback;
import com.project.EventProject.model.Registration;
import com.project.EventProject.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	 @Autowired
	    @Qualifier("feedRepo")
	    private FeedbackRepository feedRepo;
	@Override
	public Feedback insertrecord(Feedback r) {
		// TODO Auto-generated method stub
		return feedRepo.save(r);
	}

	@Override
	public List<Feedback> getAll() {
		// TODO Auto-generated method stub
		return feedRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		feedRepo.deleteById(ri);
		
	}

	@Override
	public Feedback updaterecord(Feedback r) {
		Optional<Feedback> opt=feedRepo.findById(r.getFeedbackid());
		if(opt.isPresent())
		{
			Feedback rold=opt.get();
			rold.setEmailid(r.getEmailid());
			rold.setMessage(r.getMessage());
			return feedRepo.save(rold);
			
		}
		return null;
	}

}
