package com.springbootmsvs.inventoryservice.controller;

import com.springbootmsvs.inventoryservice.dto.InventoryResponse;
import com.springbootmsvs.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> InStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
