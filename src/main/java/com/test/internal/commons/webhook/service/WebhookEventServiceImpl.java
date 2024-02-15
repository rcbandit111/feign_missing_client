package com.test.internal.commons.webhook.service;

import com.test.internal.commons.webhook.WebhookEventType;
import com.test.internal.commons.webhook.dto.WebhookEventDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WebhookEventServiceImpl implements WebhookEventService {

    public Optional<WebhookEventDto> findByEventType(WebhookEventType eventType)
    {
        throw new UnsupportedOperationException("Not implemented yet.!!!!!!");
    }

    public WebhookEventDto save(WebhookEventDto webhookEventDto)
    {
        throw new UnsupportedOperationException("Not implemented yet.!!!!!!");
    }
}
