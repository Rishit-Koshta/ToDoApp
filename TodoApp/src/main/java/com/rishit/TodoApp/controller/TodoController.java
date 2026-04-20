package com.rishit.TodoApp.controller;

import com.rishit.TodoApp.entity.TodoEntity;
import com.rishit.TodoApp.repositories.TodoRepositories;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoRepositories todoRepositories;

    @GetMapping({"","/","/home"})
    public String showHomePage(Model model){
        model.addAttribute("todos",todoRepositories.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title){
        TodoEntity newTodo = TodoEntity.builder()
                .title(title)
                .completed(false)
                .build();
        todoRepositories.save(newTodo);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id){
        TodoEntity existingTodo = todoRepositories.findById(id)
                .orElseThrow( ()-> new RuntimeException("Todo not found: "+id));
        existingTodo.setCompleted(true);
        todoRepositories.save(existingTodo);
        return "redirect:/";
    }

    @GetMapping ("/delete/{id}")
    public String delete(@PathVariable Long id){
        TodoEntity existingTodo = todoRepositories.findById(id)
                .orElseThrow( ()-> new RuntimeException("Todo not found: "+id));
        todoRepositories.delete(existingTodo);
        return "redirect:/";
    }
}
