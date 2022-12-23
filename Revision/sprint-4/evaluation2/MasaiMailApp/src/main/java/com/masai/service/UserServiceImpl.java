package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repositrory.EmailRepo;
import com.masai.repositrory.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo uRepo;

	@Autowired
	private EmailRepo eRepo;

	@Autowired
	private EmailService eService;

	@Override
	public User addUser(User user) throws UserException {

		if (user != null) {

			user = uRepo.save(user);

			return user;
		} else
			throw new UserException("user cannot be null");

	}

	@Override
	public User deleteUser(Integer id) throws UserException {

		User user = uRepo.findById(id).orElseThrow(() -> new UserException("No user found.."));

		uRepo.delete(user);

		return user;

	}

	@Override
	public User getUserById(Integer id) throws UserException {

		User user = uRepo.findById(id).orElseThrow(() -> new UserException("No user found.."));

		return user;
	}

	@Override
	public User updateUser(Integer id, User user) throws UserException {

		User user1 = uRepo.findById(id).orElseThrow(() -> new UserException("No user found.."));

		user.setId(id);

		user = uRepo.save(user);

		return user;

	}

	@Override
	public List<User> getAllUsers() throws UserException {

		List<User> user = uRepo.findAll();

		if (user.size() == 0)
			throw new UserException("No user found...");

		return user;

	}

	@Override
	public String sendMailToUser(Integer id, Email email, List<String> mail) throws UserException, EmailException {

		String message = "Mail send to...";

		Email email1 = eService.addEmail(email);

		User sender = uRepo.findById(id).orElseThrow(() -> new UserException("No sender found.."));

		sender.getSend().add(email1);

		uRepo.save(sender);

		for (String u : mail) {

			User user = uRepo.findByEmail(u);

			if (user != null) {
				user.getRecieve().add(email1);
				uRepo.save(user);

				message = message + user.getEmail();
			}

		}

		return message + " successfully..";

	}

	@Override
	public String starMail(Integer userId, Integer eid) throws EmailException, UserException {

		User user = uRepo.findById(userId).orElseThrow(() -> new UserException("No user found.."));

		Email email = eRepo.findById(eid).orElseThrow(() -> new EmailException("No email found.."));

		user.getStarted().add(email);

		uRepo.save(user);

		return "email started successfully";

	}

	@Override
	public String deteleMailFromStar(Integer userId, Integer eid) throws EmailException, UserException {

		User user = uRepo.findById(userId).orElseThrow(() -> new UserException("No user found.."));

		Email email = eRepo.findById(eid).orElseThrow(() -> new EmailException("No email found.."));

		List<Email> listStar = user.getStarted();

		listStar.removeIf(l -> l.getMailId() == email.getMailId());

		uRepo.save(user);

		return "email deleted from started successfully";

	}

	@Override
	public String deteleMail(Integer userId, Integer eid) throws EmailException, UserException {
		
		User user = uRepo.findById(userId).orElseThrow(() -> new UserException("No user found.."));

		Email email = eRepo.findById(eid).orElseThrow(() -> new EmailException("No email found.."));
		
		List<Email> listStar = user.getStarted();

		listStar.removeIf(l -> l.getMailId() == email.getMailId());
		
		List<Email> listRecieve = user.getRecieve();
        
		listRecieve.removeIf(l -> l.getMailId() == email.getMailId());
		
		List<Email> listSend = user.getRecieve();
		
		listSend.removeIf(l -> l.getMailId() == email.getMailId());
		
		uRepo.save(user);
		
		eService.deleteEmail(eid);

		return "email deleted successfully";
	}

	@Override
	public List<Email> getAllMails(Integer id) throws UserException {
		
		User user = uRepo.findById(id).orElseThrow(() -> new UserException("No user found.."));
		
		List<Email> list = new ArrayList<>();
		
		List<Email> star = user.getStarted();
		List<Email> recieve = user.getRecieve();
		List<Email> send = user.getSend();
		
		for(Email s:star) {
			list.add(s);
		}
		
		for(Email s:recieve) {
			list.add(s);
		}
		
		for(Email s:send) {
			list.add(s);
		}
		
		if(list.size()==0) throw new UserException("No emails found..");
		
		return list;
	
	}

	@Override
	public List<Email> getAllStartedMails(Integer id) throws UserException {
		
		User user = uRepo.findById(id).orElseThrow(() -> new UserException("No user found.."));
		
		List<Email> star = user.getStarted();
		
		if(star.size()==0) throw new UserException("No emails found..");
		
		return star;
		
	}

}
