package com.example.tudien.controller;

import com.example.tudien.model.DictionaryModel;
import com.example.tudien.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping("/home")
    public ModelAndView home() {
        System.out.println(123);
        return new ModelAndView("home");
    }
    @PostMapping("/home")
    public ModelAndView home(@RequestParam String word) {
        List<DictionaryModel> dictionary = dictionaryService.getAll();
        String meaning = "Không tìm thấy";
        for (DictionaryModel dictionaryModel : dictionary){
            if (dictionaryModel.getWord().equals(word)){
                meaning =  dictionaryModel.getMeaning();
            }
        }
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("meaning",meaning);
        return modelAndView;
    }
}
