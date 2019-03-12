package com.Simple200.authserver.model;

import com.Simple200.authserver.service.CustomClientDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomClientDetails implements ClientDetails {



//    final static Logger log = LoggerFactory.getLogger(CustomClientDetailsService.class);


    private static final long serialVersionUID = 6602529451366778198L;

    private Client clients;


    public CustomClientDetails(final Client clients){
        this.clients = clients;
    }

    @Override
    public String getClientId() {
        System.out.println("777777777");
        return clients.getClientId();
    }

    @Override
    public Set<String> getResourceIds() {
        final Set<String> resourcesIds = new HashSet<String>();
        resourcesIds.add(clients.getResourceIds());
        return resourcesIds;
    }

    @Override
    public boolean isSecretRequired() {
        return true;
    }

    @Override
    public String getClientSecret() {
//        System.out.println("client_ secret : " + clients.getClientSecret());
        return clients.getClientSecret();
    }

    @Override
    public boolean isScoped() {
        return true;
    }

    @Override
    public Set<String> getScope() {
        final Set<String> scopes = new HashSet<String>();
        scopes.add(clients.getScope());
        return scopes;
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        final Set<String> authorizedGrantTypes = new HashSet<String>();
        authorizedGrantTypes.add(clients.getAuthorizedGrantTypes());
        return authorizedGrantTypes;

    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        final Set<String> registeredRedirectUris = new HashSet<String>();
        registeredRedirectUris.add(clients.getWebServerRedirectUri());
        return registeredRedirectUris;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        final Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(clients.getAuthorities()));
        return authorities;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return clients.getAccessTokenValidity();
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return clients.getRefreshTokenValidity();
    }

    @Override
    public boolean isAutoApprove(String scope) {
        System.out.println("Scope :"+ scope);
        System.out.println("Autoapprove :" +clients.getAutoapprove());
        return clients.getAutoapprove();
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        final Set<String> additionalInformation = new HashSet<String>();
        additionalInformation.add(clients.getAdditionalInformation());
        return null;
    }

}
