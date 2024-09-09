package com.chunchun21.KF.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.chunchun21.KF.entities.EmailDetails;
import com.chunchun21.KF.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
 
    @Autowired private JavaMailSender javaMailSender;
 
    @Value("${spring.mail.username}") private String sender;
    
    @Override
    public String sendSimpleMail(EmailDetails email) {
        // TODO Auto-generated method stub
       try {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(sender);
        simpleMailMessage.setTo("hoangtrung210400@gmail.com");
        simpleMailMessage.setSubject(email.getSubject());
        simpleMailMessage.setText(email.getMsgBody());
        javaMailSender.send(simpleMailMessage);

        return "Mail send success";
       } catch (Exception e) {
        // TODO: handle exception
        return "mail send fail";
       }
    }

    @Override
    public String sendSimpleMailWithAttachment(EmailDetails email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendSimpleMailWithAttachment'");
    }
    
}
