package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise1 {

    @RequestMapping("/exercise1")
    public String showOneAccount (Model model) {
        BankAccount testAccount = new BankAccount("Simba", 2000, "zebra",  "lion", "good");
        String showFields = testAccount.getName() + " " + testAccount.getBalance() + " " + testAccount.getCurrency() + " " + testAccount.getAnimalType() + " " + testAccount.getAlignment();
        model.addAttribute("defaultField", showFields);
        return "showaccount";
    }

}
