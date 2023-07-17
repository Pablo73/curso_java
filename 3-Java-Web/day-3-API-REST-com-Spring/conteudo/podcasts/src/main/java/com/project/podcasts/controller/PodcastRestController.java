package com.project.podcasts.controller;

import com.project.podcasts.entity.PodcastCreationDto;
import com.project.podcasts.entity.PodcastDto;
import com.project.podcasts.service.PodcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Random;

@RestController
@RequestMapping("/podcasts")
public class PodcastRestController {

  private PodcastService service;

  @Autowired
  public PodcastRestController(PodcastService service) {
    this.service = service;
  }

  @GetMapping
//  @RequestMapping(method=RequestMethod.GET)
  public String getRoot() {
    return "Yay Podcasts!!!!!";
  }


  @GetMapping("/{id}")
  public ResponseEntity<PodcastDto> getPodcast(@PathVariable Integer id) {
    if (id > 1000)
      return ResponseEntity.notFound().build();

    Podcast podcast = service.findPodcastById(id);

    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );

    return ResponseEntity.ok(podcastDto);
  }
  
  @GetMapping("/search")
  public String searchPodcast(@RequestParam String title) {
    return String.format("Você buscou por Podcasts com o tít: %s", title);
  }


  @PostMapping
  public ResponseEntity<PodcastDto> newPodcast(@RequestBody PodcastCreationDto newPodcast) {
    Podcast podcast = service.createPodcast(newPodcast);

    PodcastDto podcastDto = new PodcastDto(
        podcast.getId(), podcast.getName(), podcast.getUrl()
    );

    return ResponseEntity.status(HttpStatus.CREATED).body(podcastDto);
  }
}
