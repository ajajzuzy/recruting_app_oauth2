package com.Simple200.authserver.service;

import com.Simple200.authserver.Repository.ClientsRepository;
import com.Simple200.authserver.model.Client;
import com.Simple200.authserver.model.CustomClientDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@Configuration
public class CustomClientDetailsService implements ClientDetailsService {

    @Autowired
    private ClientsRepository clientsRepository;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

        Optional<Client> clientOptional = clientsRepository.findByClientId(clientId);

        System.out.println("88888888");

        clientOptional
                .orElseThrow(()-> new ClientRegistrationException("Username not found!"));

        System.out.println("6666666");

        return clientOptional.map(CustomClientDetails::new)
                .get();

//
//        final CustomClientDetails customClientDetails = new CustomClientDetails(client);
//        System.out.println("Custom :" +customClientDetails.getClientId().toString());
//        System.out.println("Authorit :" + customClientDetails.isAutoApprove(client.getScope()) );
//        return customClientDetails;
    }
}
