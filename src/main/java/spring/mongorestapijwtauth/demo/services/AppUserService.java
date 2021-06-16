package spring.mongorestapijwtauth.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import spring.mongorestapijwtauth.demo.entities.AppUser;
import spring.mongorestapijwtauth.demo.repositories.AppUserRepository;

@Service
public class AppUserService {

    @Autowired
    AppUserRepository appUserRepository;

    public void insertAppUser(AppUser appUser) {
        appUserRepository.insert(appUser);
    }

    public Optional<AppUser> getAppUserByUname(String uname) {
        return appUserRepository.findAppUserByUname(uname);
    }

    public List<AppUser> getAllAppUsers() {
        System.out.println(appUserRepository.count() + "#######################");
        return appUserRepository.findAll();
    }

    public AppUser updateUserDetail(String id, AppUser appUser) {
        AppUser appUserDetail = (AppUser) appUserRepository.findById(id).get();
        appUserDetail.setUname(appUser.getUname());
        appUserDetail.setIs_active(appUser.isIs_active());
        appUserRepository.save(appUserDetail);
        return appUserDetail;
    }

    public void deleteAppUser(String id) {
        appUserRepository.deleteById(id);
    }

}
