package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    Client recupererClientParId(Long id);
    List<Client> recupererTousLesClients();
    void supprimerClient(Long id);
}