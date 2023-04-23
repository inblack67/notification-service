package com.inblack67.micro.spring.ecom.notification.controllers

import com.inblack67.micro.spring.ecom.notification.dtos.NotificationReq
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/notification")
class NotificationController {
    @PostMapping
    fun sendNotification(@RequestBody notificationReq: NotificationReq): Boolean {
        Thread.sleep(10000);
        return true
    }
}