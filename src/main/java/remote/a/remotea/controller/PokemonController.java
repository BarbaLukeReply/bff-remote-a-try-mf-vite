package remote.a.remotea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import remote.a.remotea.models.Pokemon;
import remote.a.remotea.services.PokemonService;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/api/pokemon/{id}")
    public Pokemon getPokemon(@PathVariable int id) {
        Pokemon pokemon = pokemonService.getPokemon(id);
        // Esegui le lavorazioni necessarie sui dati di pokemon
        return pokemon;
    }
}

