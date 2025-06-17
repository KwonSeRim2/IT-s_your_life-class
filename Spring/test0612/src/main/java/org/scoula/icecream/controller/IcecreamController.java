package org.scoula.icecream.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.icecream.dto.IcecreamDTO;
import org.scoula.icecream.service.IcecreamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/icecream")
@RequiredArgsConstructor
@Log4j2
public class IcecreamController {
    final private IcecreamService service;

    @GetMapping("/list")
    public void list(Model model){
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/new")
    public void create(){
        log.info("create");
    }

    @PostMapping("/new")
    public String create(IcecreamDTO dto){

        log.info("create"+dto);

        service.create(dto);

        return "redirect:/icecream/list";
    }
}
