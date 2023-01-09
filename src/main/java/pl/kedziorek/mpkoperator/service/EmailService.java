package pl.kedziorek.mpkoperator.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
    void sendMail(SimpleMailMessage msg);
    SimpleMailMessage prepareInfoMailAboutCreatedAccount(
            Long id,
            String email,
            String name,
            String password,
            String createdBy);
    SimpleMailMessage prepareMailToResetPassword(String email, String name, String password);
}