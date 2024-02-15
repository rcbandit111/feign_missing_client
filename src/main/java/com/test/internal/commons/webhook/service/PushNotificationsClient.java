package com.test.internal.commons.webhook.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "notifications")
public interface PushNotificationsClient {

    @PostMapping(value = "/", // TODO
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    String createEvent(String token, String eventCreationRequest);

}
