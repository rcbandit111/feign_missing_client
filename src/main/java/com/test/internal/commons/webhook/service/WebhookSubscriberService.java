package com.test.internal.commons.webhook.service;

import com.test.internal.commons.webhook.dto.WebhookSubscriberDto;

import java.util.Optional;

public interface WebhookSubscriberService {

    public Optional<WebhookSubscriberDto> findById(String id);
}
