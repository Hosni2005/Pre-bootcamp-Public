package com.axsos.burgertracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.axsos.burgertracker.models.Burger;
import com.axsos.burgertracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {

    private final BurgerService burgerService;
    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping("/")
    public String index(@ModelAttribute("burger") Burger burger, Model model) {
        model.addAttribute("burgers", burgerService.allBurgers());
        return "index";
    }

    @PostMapping("/burgers")
    public String createBurger(
            @Valid @ModelAttribute("burger") Burger burger,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("burgers", burgerService.allBurgers());
            return "index";
        }

        burgerService.saveBurger(burger);
        return "redirect:/";
    }

    @GetMapping("/burgers/{id}/edit")
    public String editBurger(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerService.findBurger(id);
        model.addAttribute("burger", burger);
        return "edit";
    }

    @PostMapping("/burgers/{id}/update")
    public String updateBurger(
            @Valid @ModelAttribute("burger") Burger burger,
            BindingResult result) {

        if (result.hasErrors()) {
            return "edit";
        }

        burgerService.saveBurger(burger);
        return "redirect:/";
    }
}