package com.kurtg.gateway.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NotificationRequest {
    private int customerId;
    private String notificationMode;
    private String notificationContent;
    private String emailSubject;
    private String emailAddress;
    private String phoneNumber;
}
