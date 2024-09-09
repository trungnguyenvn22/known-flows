package com.chunchun21.KF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chunchun21.KF.entities.EmailDetails;
import com.chunchun21.KF.service.EmailService;


@RestController
public class MailController {
    @Autowired
    private EmailService emailService;
 
   @PostMapping("/send-mail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
        String status
            = emailService.sendSimpleMail(details);
 
        return status;
    }
    
    
}
