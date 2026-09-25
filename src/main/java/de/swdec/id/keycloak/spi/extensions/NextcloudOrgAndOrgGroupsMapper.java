package de.swdec.id.keycloak.spi.extensions;

import java.util.List;

import org.keycloak.organization.protocol.mappers.oidc.OrganizationMembershipMapper;
import org.keycloak.provider.ProviderConfigProperty;

class NextcloudOrgAndOrgGroupsMapper extends OrganizationMembershipMapper {
    public static final String PROVIDER_ID = "oidc-nextcloud-org-and-org-groups-mapper";

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        List<ProviderConfigProperty> properties = super.getConfigProperties();

        return properties;
    }

    @Override
    public String getDisplayType() {
        return "Nextcloud Org and Org-Groups Mapper";
    }
}
