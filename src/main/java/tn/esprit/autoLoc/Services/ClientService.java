package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.ClientRepositorie;
import tn.esprit.autoLoc.entities.Client;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientService implements IClientService {

    private final ClientRepositorie clientRepo;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        if (client.getIdClient() == null ||
                !clientRepo.existsById(client.getIdClient())) {
            throw new RuntimeException("Client introuvable");
        }
        return clientRepo.save(client);
    }

    @Override
    @Transactional(readOnly = true)
    public Client recupererClientParId(Long id) {
        return clientRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Client introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Client> recupererTousLesClients() {
        return clientRepo.findAll();
    }

    @Override
    public void supprimerClient(Long id) {
        if (!clientRepo.existsById(id)) {
            throw new RuntimeException("Client introuvable : " + id);
        }
        clientRepo.deleteById(id);
    }
}