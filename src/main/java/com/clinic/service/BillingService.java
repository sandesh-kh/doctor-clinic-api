package com.clinic.service;

import com.clinic.entity.Billing;
import com.clinic.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }

    public Billing getBillingById(Long id) {
        return billingRepository.findById(id).orElse(null);
    }

    public Billing saveBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    public void deleteBilling(Long id) {
        billingRepository.deleteById(id);
    }
}
