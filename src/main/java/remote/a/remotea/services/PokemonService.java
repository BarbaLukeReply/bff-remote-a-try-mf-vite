package remote.a.remotea.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import remote.a.remotea.models.Pokemon;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;

    public PokemonService() {
        this.restTemplate = new RestTemplate();
    }

    private static final String POKEMON_API_URL = "https://pokeapi.co/api/v2/pokemon/{id}";

    public Pokemon getPokemon(int id) {
        return restTemplate.getForObject(POKEMON_API_URL, Pokemon.class, id);
    }
}


