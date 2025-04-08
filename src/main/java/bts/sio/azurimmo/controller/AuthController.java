package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Utilisateur;
import bts.sio.azurimmo.repository.UtilisateurRepository;
import bts.sio.azurimmo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Utilisateur> register(@RequestBody Utilisateur utilisateur) {
        try {
            String pwd = utilisateur.getPassword();
            utilisateur.setPassword(authService.hashPassword(pwd));
            utilisateurRepository.save(utilisateur);
            return ResponseEntity.ok(utilisateur);
        } catch (Exception e) {

        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Utilisateur> login(@RequestBody Utilisateur utilisateur) {

    }
}
