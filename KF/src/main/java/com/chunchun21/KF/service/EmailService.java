package com.chunchun21.KF.service;

import com.chunchun21.KF.entities.EmailDetails;

public interface EmailService {
    
    String sendSimpleMail(EmailDetails email);
    String sendSimpleMailWithAttachment(EmailDetails email);
}
