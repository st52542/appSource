package fei.upce.appsource.controller;

import fei.upce.appsource.Entity.SourceData;
import fei.upce.appsource.service.SourceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sourcedata")
public class SourceDataController {
    @Autowired
    private SourceDataService sourceDataService;

    @GetMapping("/getAllData")
    @PreAuthorize("hasRole('READER') or hasRole('FULL') or hasRole('ADMIN')")
    public List<Optional<SourceData>> showAllSourceData() {
        try {
            return sourceDataService.getSourceData();
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
