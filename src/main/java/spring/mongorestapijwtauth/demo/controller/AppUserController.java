package spring.mongorestapijwtauth.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import spring.mongorestapijwtauth.demo.entities.AppUser;
import spring.mongorestapijwtauth.demo.services.AppUserService;

@RestController
@RequestMapping("api/v1/users")
public class AppUserController {

    @Autowired
    AppUserService service;

    @PostMapping
    private void insertAppUser(@RequestBody AppUser appUser) {
        service.insertAppUser(appUser);
    }

    @GetMapping
    private List<AppUser> getAllAppUsers() {
        return service.getAllAppUsers();
    }

    @PutMapping("/{id}")
    private AppUser updateUserDetail(@PathVariable("id") String id, @RequestBody AppUser appUser) {
        return service.updateUserDetail(id, appUser);
    }

    @DeleteMapping("/{id}")
    private void deleteAppUser(@PathVariable("id") String id) {
        service.deleteAppUser(id);
    }

}
