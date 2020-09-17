package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skill Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String programLangForm(){
        String form = "<html>" +
                "<body>" +
                "<form action='' method='POST'>" +
                "<label for='name'>Name: </label>" +
                "<input type='text' id='name' name='name'>" +
                "</br>" +
                "<label for='first'> My Favorite Language: </label>" +
                "</br>" +
                "<select name='first' id='first-select'>" +
                "<option value='java'> Java </option>" +
                "<option value='python'> Python </option>" +
                "<option value='javascript'> JavaScript </option>" +
                "</select>" +
                "</br>" +
                "<select name='second' id='second-select'>" +
                "<option value='java'> Java </option>" +
                "<option value='python'> Python </option>" +
                "<option value='javascript'> JavaScript </option>" +
                "</select>" +
                "</br>" +
                "<select name='third' id='third-select'>" +
                "<option value='java'> Java </option>" +
                "<option value='python'> Python </option>" +
                "<option value='javascript'> JavaScript </option>" +
                "</select>" +
                "</br>" +
                "<input type='submit' value='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return form;
    }

    @PostMapping("form")
    @ResponseBody
    public String userInput(
            @RequestParam String name,
            @RequestParam String first,
            @RequestParam String second,
            @RequestParam String third
    ){
        String html = "<html>" +
                "<body>" +
                "<h1> " + name + "</h1>" +
                "<h2> Favorite Programs</h2>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    };
}
