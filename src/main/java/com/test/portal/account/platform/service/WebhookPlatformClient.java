package com.test.portal.account.platform.service;

import com.test.internal.commons.webhook.service.PushNotificationsClient;
import com.test.internal.commons.webhook.service.WebhookEventService;
import com.test.internal.commons.webhook.service.WebhookSubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebhookPlatformClient {

  private PushNotificationsClient pushNotificationsClient;

  private WebhookSubscriberService webhookSubscriberService;

  private WebhookEventService webhookEventService;

  @Autowired
  public WebhookPlatformClient(PushNotificationsClient pushNotificationsClient, WebhookSubscriberService webhookSubscriberService, WebhookEventService webhookEventService) {
    this.pushNotificationsClient = pushNotificationsClient;
    this.webhookSubscriberService = webhookSubscriberService;
    this.webhookEventService = webhookEventService;
  }

  public void send(){
    pushNotificationsClient.createEvent(null, null);
  }

}
