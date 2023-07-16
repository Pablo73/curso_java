package com.project.podcasts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/podcasts")
public class PodcastRestController {
  
  @GetMapping
//  @RequestMapping(method=RequestMethod.GET)
  public String getRoot() {
    return "Yay Podcasts!!!!!";
  }
  
  @GetMapping("/{id}")
  public String getPodcast(@PathVariable Integer id) {
    return String.format("Você pediu pelo Podcast com id: %d", id);
  }
  
  @GetMapping("/search")
  public String searchPodcast(@RequestParam String title) {
    return String.format("Você buscou por Podcasts com o tít: %s", title);
  }
}
