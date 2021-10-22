package com.tts.MapsApp.controller;

import com.tts.MapsApp.model.Location;
import com.tts.MapsApp.service.MapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MapController {

    @Autowired
    MapsService mapsService;

    @GetMapping("/home")
    public String getDefaultMap(Model model) {
        model.addAttribute(new Location());
        return "index";
    }

    @PostMapping("/home")
    public String getMapForLocation(Location location, Model model) {
        mapsService.addCoordinates(location);
        model.addAttribute(location);
        return "index";
    }

    @PostMapping("/random")
    public String getRandomLocation(Location location, Model model) {
        mapsService.setRandomCoordinates(location);
        System.out.println(location);
        model.addAttribute(location);
        return "index";
    }
}


/*
echo "# Google-Maps-API-Project" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/isaac-michel224/Google-Maps-API-Project.git
git push -u origin main
 */