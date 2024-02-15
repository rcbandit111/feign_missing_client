package com.test.internal.commons.webhook.service;

import com.test.internal.commons.webhook.WebhookEventType;
import com.test.internal.commons.webhook.dto.WebhookEventDto;

import java.util.Optional;

public interface WebhookEventService {

    public Optional<WebhookEventDto> findByEventType(WebhookEventType eventType);

    public WebhookEventDto save(WebhookEventDto webhookEventDto);
}
