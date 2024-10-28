package com.clinic.controller;

import com.clinic.entity.Billing;
import com.clinic.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billings")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @GetMapping
    public List<Billing> getAllBillings() {
        return billingService.getAllBillings();
    }

    @GetMapping("/{id}")
    public Billing getBillingById(@PathVariable Long id) {
        return billingService.getBillingById(id);
    }

    @PostMapping
    public Billing createBilling(@RequestBody Billing billing) {
        return billingService.saveBilling(billing);
    }

    @PutMapping("/{id}")
    public Billing updateBilling(@PathVariable Long id, @RequestBody Billing billing) {
        billing.setId(id);
        return billingService.saveBilling(billing);
    }

    @DeleteMapping("/{id}")
    public void deleteBilling(@PathVariable Long id) {
        billingService.deleteBilling(id);
    }
}
