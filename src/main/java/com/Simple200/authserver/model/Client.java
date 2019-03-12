package com.Simple200.authserver.model;


import javax.persistence.*;

@Entity
@Table(name = "oauth_client_details")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "client_secret")
    private String clientSecret;

    @Column(name = "access_token_validity")
    private Integer accessTokenValidity;

    @Column(name = "additional_information")
    private String additionalInformation;

    @Column(name = "authorities")
    private String authorities;

    @Column(name = "autoapprove")
    private boolean autoapprove;

    @Column(name = "authorized_grant_types")
    private String AuthorizedGrantTypes;

    @Column(name = "refresh_token_validity")
    private Integer refreshTokenValidity;

    @Column(name = "resource_ids")
    private String resourceIds;

    @Column(name = "scope")
    private String scope;

    @Column(name = "web_server_redirect_uri")
    private String webServerRedirectUri;

    public Client(Client clients){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public boolean getAutoapprove() {
        return autoapprove;
    }

    public void setAutoapprove(boolean autoapprove) {
        this.autoapprove = autoapprove;
    }

    public String getAuthorizedGrantTypes() {
        return AuthorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        AuthorizedGrantTypes = authorizedGrantTypes;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getWebServerRedirectUri() {
        return webServerRedirectUri;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri;
    }
}
