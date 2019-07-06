package net.woonizzooni.cloud.config.client.customer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CustomerController {

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @RequestMapping("/config")
    public ResponseEntity getConfig() {
        return ResponseEntity.ok(String.format("%s,%s", username, password));
    }
}
