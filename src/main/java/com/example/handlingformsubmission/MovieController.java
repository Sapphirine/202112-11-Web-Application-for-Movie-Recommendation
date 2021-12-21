package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

  @GetMapping("/movie")
  public String movieForm(Model model) {
    model.addAttribute("movie", new Movie());
    return "movie";
  }

  @PostMapping("/movie")
  public String movieSubmit(@ModelAttribute Movie movie, Model model) {
	Recommend rec = new Recommend();
	rec.setName(movie.getName());
	String[] recommend = rec.getRecommend();
    model.addAttribute("recommend", recommend);   
    return "result";
  }

}