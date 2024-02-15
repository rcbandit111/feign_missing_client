package com.test.internal.commons.webhook.service;

import com.test.internal.commons.webhook.dto.WebhookSubscriberDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WebhookSubscriberServiceImpl implements WebhookSubscriberService {

    public Optional<WebhookSubscriberDto> findById(String id)
    {
        throw new UnsupportedOperationException("Not implemented yet.!!!!!!");
    }
}
